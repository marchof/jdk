/*
 * Copyright (c) 2018, 2019, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

// key: compiler.err.prob.found.req
// key: compiler.misc.incompatible.ret.type.in.lambda
// key: compiler.misc.switch.expression.target.cant.be.void
// key: compiler.note.preview.filename
// key: compiler.note.preview.recompile
// options: --enable-preview -source ${jdk.version}

class SwitchExpressionTargetCantBeVoid {

    interface SAM {
        void m();
    }

    void test(int cond, Object o1, Object o2, Object o3) {
        SAM s = ()-> switch (cond) { case 0 -> o1; case 1 -> o2; default -> o3; };
    }
}
