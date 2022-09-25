package com.google.android.apps.gsa.search.core.p6517ak.p6518a;

import com.google.p4152bb.p4153a.C55136he;

/* renamed from: com.google.android.apps.gsa.search.core.ak.a.e */
/* compiled from: PG */
public final class C84578e {

    /* renamed from: a */
    public final String f230165a;

    /* renamed from: b */
    public final String f230166b;

    /* renamed from: c */
    public final String f230167c;

    /* renamed from: d */
    public final String f230168d;

    /* renamed from: e */
    public final String f230169e;

    /* renamed from: f */
    public final String f230170f;

    /* renamed from: g */
    public final String f230171g;

    /* renamed from: h */
    public final C55136he f230172h;

    /* renamed from: i */
    public final int f230173i;

    /* renamed from: j */
    public final int f230174j;

    public C84578e(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, int i2, C55136he heVar) {
        this.f230165a = str;
        this.f230166b = str2;
        this.f230167c = str3;
        this.f230168d = str4;
        this.f230169e = str5;
        this.f230170f = str6;
        this.f230171g = str7;
        this.f230173i = i;
        this.f230174j = i2;
        this.f230172h = heVar;
    }

    /* renamed from: a */
    public final boolean mo78338a() {
        return this.f230174j != -1;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("IcingMatch{ Text1=");
        sb.append(this.f230165a);
        sb.append(" Text2=");
        sb.append(this.f230166b);
        sb.append(" Uri=");
        sb.append(this.f230167c);
        sb.append(" Data=");
        sb.append(this.f230168d);
        sb.append(" ExtraData=");
        sb.append(this.f230169e);
        sb.append(" AppPackage=");
        sb.append(this.f230170f);
        sb.append(" Type=");
        sb.append(this.f230171g);
        sb.append(" VisualElement=");
        sb.append(this.f230173i);
        sb.append(" GenericEntityIndex=");
        sb.append(this.f230174j);
        sb.append(" VocalizedPerformPrompt=");
        C55136he heVar = this.f230172h;
        if (heVar == null) {
            str = null;
        } else {
            str = heVar.f145133b;
        }
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
