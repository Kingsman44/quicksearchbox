package com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j;

import android.app.Activity;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.opa.p8185ah.C106161b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58869cf;
import com.google.common.base.C58903m;
import com.google.common.base.C58911u;
import com.google.common.p4541l.C59326i;
import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.j.do */
/* compiled from: PG */
public final class C114872do {
    /* renamed from: a */
    public static String m190398a(String str) {
        for (String str2 : C58869cf.m90936b(new C58903m(';')).mo56152f(C58911u.f156751b).mo56153g(str)) {
            if (str2.contains("zero_state_action_name=")) {
                return str2.substring(str2.indexOf("=") + 1);
            }
        }
        return BuildConfig.FLAVOR;
    }

    /* renamed from: b */
    public static Map m190399b(String str) {
        HashMap hashMap = new HashMap();
        if (str.isEmpty()) {
            return hashMap;
        }
        ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(C59326i.f157516d.mo56836k(str)));
        Object readObject = objectInputStream.readObject();
        objectInputStream.close();
        return readObject instanceof Map ? (Map) readObject : hashMap;
    }

    /* renamed from: c */
    public static void m190400c(Activity activity, C58833ax axVar, Runnable runnable, C91097g gVar) {
        if (!axVar.mo56113h() || !((C106161b) axVar.mo56107c()).mo95336c()) {
            runnable.run();
        } else {
            ((C106161b) axVar.mo56107c()).mo95334a(activity, new C114871dn((C106161b) axVar.mo56107c(), runnable), gVar);
        }
    }
}
