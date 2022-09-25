package com.google.android.apps.search.podcasts.widgets.feedback;

import android.os.Bundle;
import com.google.apps.tiktok.monitoring.feedback.C47465c;
import com.google.apps.tiktok.monitoring.feedback.C47474k;
import com.google.apps.tiktok.monitoring.feedback.C47475l;
import com.google.apps.tiktok.p3633d.p3634a.C46663a;
import com.google.apps.tiktok.p3633d.p3634a.C46667e;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C63088z;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import p5462h.C69685i;
import p5462h.p5463a.C69505av;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.widgets.feedback.a */
/* compiled from: PG */
public final class C141248a {
    /* renamed from: a */
    public static final C47475l m229278a(String str, Bundle bundle) {
        C47474k g = C47475l.m84477g();
        g.mo51310d(true);
        ((C47465c) g).f123249a = "Podcasts";
        if (bundle != null) {
            C59071e eVar = FeedbackHelper.f383465a;
            Set<String> keySet = bundle.keySet();
            C69664n.m101060f(keySet, "keySet()");
            ArrayList arrayList = new ArrayList(C69540x.m100804k(keySet, 10));
            for (String str2 : keySet) {
                C69664n.m101058d(str2);
                String string = bundle.getString(str2);
                C69664n.m101058d(string);
                arrayList.add(new C69685i(str2, string));
            }
            Map p = C69505av.m100874p(arrayList);
            if (p != null) {
                for (Map.Entry entry : p.entrySet()) {
                    C46663a aVar = new C46663a();
                    aVar.mo50684b(false);
                    aVar.mo50686d(C46667e.KEY_VALUE);
                    aVar.f121916a = C63088z.m96143E((String) entry.getValue());
                    g.mo51333f((String) entry.getKey(), aVar.mo50683a());
                }
            }
        }
        if (str != null) {
            C46663a aVar2 = new C46663a();
            aVar2.mo50686d(C46667e.KEY_VALUE);
            aVar2.mo50684b(false);
            aVar2.f121916a = C63088z.m96143E(str);
            g.mo51333f("active_episode", aVar2.mo50683a());
        }
        C47475l e = g.mo51332e();
        C69664n.m101060f(e, "feedbackOptionsBuilder.build()");
        return e;
    }
}
