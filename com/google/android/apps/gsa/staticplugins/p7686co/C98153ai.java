package com.google.android.apps.gsa.staticplugins.p7686co;

import com.google.common.base.C58817ah;
import com.google.p375ai.p378b.C7625dy;
import com.google.p375ai.p378b.C7653ez;
import com.google.p375ai.p378b.C7750io;
import com.google.p4184bj.p4189b.C55893j;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.ai */
/* compiled from: PG */
final class C98153ai implements C58817ah {
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C7750io ioVar;
        C7625dy dyVar;
        C7750io ioVar2;
        C7653ez ezVar = (C7653ez) obj;
        if (ezVar.f26567b == 1) {
            ioVar = (C7750io) ezVar.f26568c;
        } else {
            ioVar = C7750io.f27119d;
        }
        if ((ioVar.f27121a & 2) != 0) {
            if (ezVar.f26567b == 1) {
                ioVar2 = (C7750io) ezVar.f26568c;
            } else {
                ioVar2 = C7750io.f27119d;
            }
            dyVar = ioVar2.f27123c;
            if (dyVar == null) {
                dyVar = C7625dy.f26342c;
            }
        } else {
            dyVar = ezVar.f26567b == 2 ? (C7625dy) ezVar.f26568c : null;
        }
        if (dyVar == null) {
            return null;
        }
        C55893j jVar = dyVar.f26345b;
        return jVar == null ? C55893j.f148728h : jVar;
    }
}
