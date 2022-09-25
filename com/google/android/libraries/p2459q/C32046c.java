package com.google.android.libraries.p2459q;

import com.google.common.p4522b.C58528ij;
import java.util.Set;
import java.util.TimeZone;
import org.p5633c.p5634a.C72288l;
import org.p5633c.p5634a.p5640f.C72280j;
import p3186j$.util.DesugarTimeZone;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.libraries.q.c */
/* compiled from: PG */
public final class C32046c implements C72280j {

    /* renamed from: a */
    public static final C58528ij f86103a = C58528ij.m90008H(TimeZone.getAvailableIDs());

    /* renamed from: b */
    private static final TimeZone f86104b = DesugarTimeZone.getTimeZone("UTC");

    /* renamed from: c */
    private static final ConcurrentHashMap f86105c = new ConcurrentHashMap();

    /* renamed from: a */
    public final Set mo37833a() {
        return f86103a;
    }

    /* renamed from: b */
    public final C72288l mo37834b(String str) {
        if (str == null) {
            return C72288l.f192416b;
        }
        ConcurrentHashMap concurrentHashMap = f86105c;
        C72288l lVar = (C72288l) concurrentHashMap.get(str);
        if (lVar == null) {
            TimeZone timeZone = DesugarTimeZone.getTimeZone(str);
            if (timeZone == null || timeZone.hasSameRules(f86104b)) {
                lVar = C72288l.f192416b;
            } else {
                lVar = new C32045b(timeZone);
            }
            C72288l lVar2 = (C72288l) concurrentHashMap.putIfAbsent(str, lVar);
            if (lVar2 != null) {
                return lVar2;
            }
        }
        return lVar;
    }
}
