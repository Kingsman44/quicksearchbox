package com.google.p395al.p417d.p418a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.al.d.a.al */
/* compiled from: PG */
public enum C8532al implements C62957cd {
    HTML(1),
    JESR(2),
    BTF_JS(3);
    

    /* renamed from: d */
    public final int f29591d;

    private C8532al(int i) {
        this.f29591d = i;
    }

    /* renamed from: a */
    public static C8532al m23273a(int i) {
        if (i == 1) {
            return HTML;
        }
        if (i == 2) {
            return JESR;
        }
        if (i != 3) {
            return null;
        }
        return BTF_JS;
    }

    /* renamed from: b */
    public static C62959cf m23274b() {
        return C8531ak.f29586a;
    }

    public final int getNumber() {
        return this.f29591d;
    }

    public final String toString() {
        return Integer.toString(this.f29591d);
    }
}
