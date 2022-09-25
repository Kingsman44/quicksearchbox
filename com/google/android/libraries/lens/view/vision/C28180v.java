package com.google.android.libraries.lens.view.vision;

import android.util.Size;
import com.google.android.libraries.lens.common.p1998a.C24095c;
import com.google.lens.p4707j.C62440bq;
import com.google.lens.p4707j.C62441br;
import com.google.lens.p4707j.C62444bu;
import com.google.lens.p4707j.C62445bv;
import com.google.lens.p4707j.C62491dn;

/* renamed from: com.google.android.libraries.lens.view.vision.v */
/* compiled from: PG */
public final class C28180v {
    /* renamed from: a */
    public static C62441br m52673a(C28179u uVar, Size size) {
        C62440bq bqVar = (C62440bq) C62441br.f168608h.createBuilder();
        float f = uVar.mo33662f();
        int width = size.getWidth();
        bqVar.copyOnWrite();
        C62441br brVar = (C62441br) bqVar.instance;
        brVar.f168610a |= 1;
        brVar.f168611b = f / ((float) width);
        float g = uVar.mo33663g();
        int height = size.getHeight();
        bqVar.copyOnWrite();
        C62441br brVar2 = (C62441br) bqVar.instance;
        brVar2.f168610a |= 2;
        brVar2.f168612c = g / ((float) height);
        float d = uVar.mo33659d();
        int width2 = size.getWidth();
        bqVar.copyOnWrite();
        C62441br brVar3 = (C62441br) bqVar.instance;
        brVar3.f168610a |= 4;
        brVar3.f168613d = d / ((float) width2);
        float e = uVar.mo33660e();
        int height2 = size.getHeight();
        bqVar.copyOnWrite();
        C62441br brVar4 = (C62441br) bqVar.instance;
        brVar4.f168610a |= 8;
        brVar4.f168614e = e / ((float) height2);
        float c = uVar.mo33658c();
        bqVar.copyOnWrite();
        C62441br brVar5 = (C62441br) bqVar.instance;
        brVar5.f168610a |= 16;
        brVar5.f168615f = c;
        bqVar.copyOnWrite();
        C62441br brVar6 = (C62441br) bqVar.instance;
        brVar6.f168616g = 1;
        brVar6.f168610a |= 32;
        return (C62441br) bqVar.build();
    }

    /* renamed from: b */
    public static C62445bv m52674b(C28179u uVar, Size size) {
        C62444bu buVar = (C62444bu) C62445bv.f168618e.createBuilder();
        C62441br a = m52673a(uVar, size);
        buVar.copyOnWrite();
        C62445bv bvVar = (C62445bv) buVar.instance;
        a.getClass();
        bvVar.f168621b = a;
        bvVar.f168620a |= 1;
        if (uVar.mo33697E()) {
            C62491dn k = C24095c.m44766k(uVar.mo33679u());
            buVar.copyOnWrite();
            C62445bv bvVar2 = (C62445bv) buVar.instance;
            k.getClass();
            bvVar2.f168622c = k;
            bvVar2.f168620a |= 2;
            if (uVar.mo33675r().mo56113h()) {
                float floatValue = ((Float) uVar.mo33675r().mo56107c()).floatValue();
                buVar.copyOnWrite();
                C62445bv bvVar3 = (C62445bv) buVar.instance;
                bvVar3.f168620a |= 4;
                bvVar3.f168623d = floatValue;
            }
        }
        return (C62445bv) buVar.build();
    }
}
