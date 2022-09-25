package com.google.p4486ci.p4487a;

import java.util.Comparator;
import java.util.Map;

/* renamed from: com.google.ci.a.d */
/* compiled from: PG */
public final /* synthetic */ class C58099d implements Comparator {

    /* renamed from: a */
    public static final /* synthetic */ C58099d f155300a = new C58099d();

    private /* synthetic */ C58099d() {
    }

    public final int compare(Object obj, Object obj2) {
        return ((String) ((Map.Entry) obj).getKey()).compareTo((String) ((Map.Entry) obj2).getKey());
    }
}
