package com.google.android.apps.gsa.staticplugins.feedback;

import android.util.Pair;
import com.google.android.apps.gsa.assist.p501a.C9314b;
import com.google.android.apps.gsa.shared.util.debug.FeedbackData;
import com.google.android.gms.feedback.C144189a;
import com.google.android.gms.feedback.FileTeleporter;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.feedback.m */
/* compiled from: PG */
final class C101244m extends C144189a {

    /* renamed from: a */
    final /* synthetic */ FeedbackData f282536a;

    /* renamed from: b */
    final /* synthetic */ boolean f282537b;

    public C101244m(FeedbackData feedbackData, boolean z) {
        this.f282536a = feedbackData;
        this.f282537b = z;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ List mo27016a() {
        String str = this.f282536a.f254175a;
        C58480gp e = C58485gu.m89837e();
        Charset forName = Charset.forName("UTF-8");
        if (str != null) {
            C59104x b = C101246o.f282539z.mo56224b();
            b.mo56378ag(C58975e.f156826a, "SendGoogleFeedback");
            ((C59052c) ((C59052c) b).mo56372aa(19915)).mo56387q("Attaching state dump to feedback: %d chars", str.length());
            e.mo55395g(new FileTeleporter(str.getBytes(forName), "state_dump"));
        }
        Map map = this.f282536a.f254181g;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                e.mo55395g(new FileTeleporter(((String) entry.getValue()).getBytes(forName), (String) entry.getKey()));
            }
        }
        return e.mo55394f();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ List mo27017b() {
        Map map = this.f282536a.f254179e;
        C58480gp e = C58485gu.m89837e();
        for (Map.Entry entry : map.entrySet()) {
            if (!this.f282537b) {
                C58528ij ijVar = C9314b.f32329a;
                if (((C58759qy) ijVar).f156534a.equals(entry.getKey())) {
                }
            }
            e.mo55395g(new Pair((String) entry.getKey(), (String) entry.getValue()));
        }
        return e.mo55394f();
    }
}
