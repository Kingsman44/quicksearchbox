package com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.common;

import android.os.Build;
import com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.C112975j;
import com.google.common.p4522b.C58485gu;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.common.e */
/* compiled from: PG */
public final class C112964e {

    /* renamed from: a */
    public static final List f313040a = new CopyOnWriteArrayList();

    /* renamed from: b */
    public static final AtomicReference f313041b = new AtomicReference(C112961b.OFF);

    /* renamed from: c */
    private static final String f313042c;

    static {
        String str = Build.MODEL;
        if (!str.startsWith("Pixel") && !str.equals("robolectric")) {
            str = "other";
        }
        f313042c = str;
    }

    /* renamed from: a */
    public static void m186953a(C112965f fVar) {
        m186954b(C58485gu.m89845m());
        for (C112975j jVar : f313040a) {
        }
    }

    /* renamed from: b */
    public static void m186954b(List list) {
        if (f313042c == null) {
            throw new NullPointerException("Null deviceModel");
        } else if (C58485gu.m89842j(list) == null) {
            throw new IllegalStateException("Missing required properties:".concat(" context"));
        }
    }
}
