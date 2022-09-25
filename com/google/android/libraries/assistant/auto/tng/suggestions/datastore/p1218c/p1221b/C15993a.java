package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1218c.p1221b;

import android.content.Context;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1218c.p1219a.p1220a.C15990c;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1218c.p1219a.p1220a.C15991d;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1218c.p1223d.C15999b;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1218c.p1223d.C16000c;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1218c.p1223d.C16001d;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16368d;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16370f;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16372h;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58486gv;
import com.google.common.p4522b.C58487gw;
import com.google.common.p4522b.C58528ij;
import com.google.protobuf.contrib.android.ProtoParsers;
import java.util.concurrent.Callable;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.c.b.a */
/* compiled from: PG */
public final /* synthetic */ class C15993a implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C15994b f47403a;

    /* renamed from: b */
    public final /* synthetic */ Context f47404b;

    public /* synthetic */ C15993a(C15994b bVar, Context context) {
        this.f47403a = bVar;
        this.f47404b = context;
    }

    public final Object call() {
        C15994b bVar = this.f47403a;
        Context context = this.f47404b;
        C16001d dVar = bVar.f47406b;
        C16372h hVar = (C16372h) ProtoParsers.m95525h(context, C16372h.f48194b.getParserForType(), R.raw.candidate_suggestions_pb);
        C58486gv gvVar = new C58486gv();
        for (C16368d dVar2 : ((C16370f) ProtoParsers.m95525h(context, C16370f.f48191b.getParserForType(), R.raw.candidate_suggestion_translations_pb)).f48193a) {
            gvVar.mo55419c(dVar2.f48184b, dVar2);
        }
        C58487gw a = gvVar.mo55417a();
        C58528ij H = C58528ij.m90008H(((String) dVar.f47411b.mo17428b()).split(","));
        dVar.f47412c.f47379t = H;
        C15991d dVar3 = dVar.f47413d;
        C46459k.m82829b(dVar3.f47397a.mo46039a(new C15990c(H), dVar3.f47398b), "Failed to update suggestion context allow listed ids.", new Object[0]);
        return (C58485gu) Collection.EL.stream(hVar.f48196a).filter(new C15999b(H)).flatMap(new C16000c(a)).collect(C58370cn.f155946a);
    }
}
