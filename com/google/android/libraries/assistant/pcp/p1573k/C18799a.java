package com.google.android.libraries.assistant.pcp.p1573k;

import android.content.ComponentName;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58758qx;
import java.util.Queue;

/* renamed from: com.google.android.libraries.assistant.pcp.k.a */
/* compiled from: PG */
public final class C18799a extends C18913ab {

    /* renamed from: a */
    private final ComponentName f52929a;

    /* renamed from: b */
    private final C58833ax f52930b;

    /* renamed from: c */
    private final Queue f52931c;

    /* renamed from: d */
    private final C58495hd f52932d;

    /* renamed from: e */
    private final C58495hd f52933e;

    /* renamed from: f */
    private final C58833ax f52934f;

    /* renamed from: g */
    private final C58833ax f52935g;

    /* renamed from: h */
    private final int f52936h;

    public C18799a(ComponentName componentName, C58833ax axVar, Queue queue, C58495hd hdVar, C58495hd hdVar2, C58833ax axVar2, int i, C58833ax axVar3) {
        if (componentName != null) {
            this.f52929a = componentName;
            this.f52930b = axVar;
            this.f52931c = queue;
            if (hdVar != null) {
                this.f52932d = hdVar;
                if (hdVar2 != null) {
                    this.f52933e = hdVar2;
                    this.f52934f = axVar2;
                    if (i != 0) {
                        this.f52936h = i;
                        this.f52935g = axVar3;
                        return;
                    }
                    throw new NullPointerException("Null statusCode");
                }
                throw new NullPointerException("Null mediaIdToParent");
            }
            throw new NullPointerException("Null folderIdToName");
        }
        throw new NullPointerException("Null componentName");
    }

    /* renamed from: a */
    public final ComponentName mo24143a() {
        return this.f52929a;
    }

    /* renamed from: b */
    public final C58833ax mo24144b() {
        return this.f52934f;
    }

    /* renamed from: c */
    public final C58833ax mo24145c() {
        return this.f52935g;
    }

    /* renamed from: d */
    public final C58833ax mo24146d() {
        return this.f52930b;
    }

    /* renamed from: e */
    public final C58495hd mo24147e() {
        return this.f52932d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C18913ab) {
            C18913ab abVar = (C18913ab) obj;
            return this.f52929a.equals(abVar.mo24143a()) && this.f52930b.equals(abVar.mo24146d()) && this.f52931c.equals(abVar.mo24150g()) && this.f52932d.equals(abVar.mo24147e()) && this.f52933e.equals(abVar.mo24149f()) && this.f52934f.equals(abVar.mo24144b()) && this.f52936h == abVar.mo24151h() && this.f52935g.equals(abVar.mo24145c());
        }
    }

    /* renamed from: f */
    public final C58495hd mo24149f() {
        return this.f52933e;
    }

    /* renamed from: g */
    public final Queue mo24150g() {
        return this.f52931c;
    }

    /* renamed from: h */
    public final int mo24151h() {
        return this.f52936h;
    }

    public final int hashCode() {
        return ((((((((((((((this.f52929a.hashCode() ^ 1000003) * 1000003) ^ this.f52930b.hashCode()) * 1000003) ^ this.f52931c.hashCode()) * 1000003) ^ C58758qx.m90643a(this.f52932d.entrySet())) * 1000003) ^ C58758qx.m90643a(this.f52933e.entrySet())) * 1000003) ^ this.f52934f.hashCode()) * 1000003) ^ this.f52936h) * 1000003) ^ this.f52935g.hashCode();
    }

    public final String toString() {
        String obj = this.f52929a.toString();
        String obj2 = this.f52930b.toString();
        String obj3 = this.f52931c.toString();
        String obj4 = this.f52932d.toString();
        String obj5 = this.f52933e.toString();
        String obj6 = this.f52934f.toString();
        String num = Integer.toString(this.f52936h - 1);
        String obj7 = this.f52935g.toString();
        return "OnDeviceMediaItems{componentName=" + obj + ", playbackStateCompat=" + obj2 + ", mediaItems=" + obj3 + ", folderIdToName=" + obj4 + ", mediaIdToParent=" + obj5 + ", bundle=" + obj6 + ", statusCode=" + num + ", errorMessage=" + obj7 + "}";
    }
}
