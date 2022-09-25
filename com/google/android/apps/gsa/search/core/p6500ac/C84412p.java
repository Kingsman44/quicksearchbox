package com.google.android.apps.gsa.search.core.p6500ac;

import com.google.common.base.C58837ba;
import com.google.p4283bv.p4287b.p4288a.p4322b.C56847c;
import com.google.p4283bv.p4287b.p4288a.p4322b.C56848d;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.apps.gsa.search.core.ac.p */
/* compiled from: PG */
public final class C84412p {

    /* renamed from: a */
    public static final C56848d f229679a = m134715a("General Error");

    static {
        m134715a("Not Implemented");
    }

    /* renamed from: a */
    public static C56848d m134715a(String str) {
        C56847c cVar = (C56847c) C56848d.f151669d.createBuilder();
        cVar.copyOnWrite();
        C56848d dVar = (C56848d) cVar.instance;
        dVar.f151671a |= 1;
        dVar.f151672b = "general_error";
        cVar.copyOnWrite();
        C56848d dVar2 = (C56848d) cVar.instance;
        str.getClass();
        dVar2.f151671a |= 2;
        dVar2.f151673c = str;
        return (C56848d) cVar.build();
    }

    /* renamed from: b */
    public static C56848d m134716b(Exception exc) {
        if (exc instanceof C84403g) {
            return ((C84403g) exc).f229666b;
        }
        String message = exc.getMessage();
        if (true == C58837ba.m90859h(message)) {
            message = "General Error";
        }
        return m134715a(message);
    }

    /* renamed from: c */
    public static String m134717c(C56848d dVar) {
        try {
            return new JSONObject().put("id", dVar.f151672b).put("debug_message", dVar.f151673c).toString();
        } catch (JSONException e) {
            throw new AssertionError(e);
        }
    }
}
