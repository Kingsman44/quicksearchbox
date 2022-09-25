package com.google.apps.p3589d.p3590a;

import com.google.apps.p3589d.p3591b.C45723n;
import com.google.apps.p3589d.p3600k.C45941f;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.apps.d.a.x */
/* compiled from: PG */
public abstract class C45707x {

    /* renamed from: a */
    private static final C45941f f120214a = C45941f.m82028e(153, 153, 153, PrivateKeyType.INVALID);

    static {
        m81446f().mo49754a();
    }

    protected C45707x() {
    }

    /* renamed from: f */
    public static C45706w m81446f() {
        C45687d dVar = new C45687d();
        dVar.f120176c = (byte) (dVar.f120176c | 1);
        dVar.mo49755b(false);
        C45941f fVar = f120214a;
        if (fVar != null) {
            dVar.f120174a = fVar;
            C45941f f = C45941f.m82029f();
            if (f != null) {
                dVar.f120175b = f;
                return dVar;
            }
            throw new NullPointerException("Null defaultColor");
        }
        throw new NullPointerException("Null placeholderColor");
    }

    /* renamed from: a */
    public abstract C45723n mo49756a();

    /* renamed from: b */
    public abstract C45941f mo49757b();

    /* renamed from: c */
    public abstract C45941f mo49758c();

    /* renamed from: d */
    public abstract boolean mo49759d();

    /* renamed from: e */
    public abstract boolean mo49760e();
}
