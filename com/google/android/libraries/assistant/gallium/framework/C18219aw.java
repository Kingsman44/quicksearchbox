package com.google.android.libraries.assistant.gallium.framework;

import com.google.protos.p5127o.C65698x;
import com.google.protos.p5127o.C65699y;

/* renamed from: com.google.android.libraries.assistant.gallium.framework.aw */
/* compiled from: PG */
public final class C18219aw {
    /* renamed from: a */
    public static C65699y m35483a() {
        return m35485c(13, "Proto cannot be parsed.");
    }

    /* renamed from: b */
    public static C65699y m35484b() {
        C65698x xVar = (C65698x) C65699y.f178500e.createBuilder();
        xVar.copyOnWrite();
        C65699y yVar = (C65699y) xVar.instance;
        yVar.f178502a |= 1;
        yVar.f178503b = 0;
        return (C65699y) xVar.build();
    }

    /* renamed from: c */
    public static C65699y m35485c(int i, String str) {
        C65698x xVar = (C65698x) C65699y.f178500e.createBuilder();
        xVar.copyOnWrite();
        C65699y yVar = (C65699y) xVar.instance;
        yVar.f178502a |= 1;
        yVar.f178503b = i;
        xVar.copyOnWrite();
        C65699y yVar2 = (C65699y) xVar.instance;
        str.getClass();
        yVar2.f178502a |= 2;
        yVar2.f178504c = str;
        return (C65699y) xVar.build();
    }
}
