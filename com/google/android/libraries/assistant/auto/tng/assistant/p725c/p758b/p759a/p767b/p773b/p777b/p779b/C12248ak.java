package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p767b.p773b.p777b.p779b;

import androidx.core.app.C1839z;
import com.google.android.apps.gsa.binaries.satin.app.C73952bc;
import com.google.android.apps.gsa.binaries.satin.app.be;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1119a.p1127e.p1128a.C15561a;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1137b.p1138a.C15591d;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1137b.p1139b.p1140a.C15592a;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.nlp.p4730a.C62799s;
import com.google.p4449cd.p4450a.C57934a;
import com.google.protos.p4985f.p5030q.C65176ej;
import dagger.p5294a.C68225k;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.ArrayList;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.b.b.b.b.ak */
/* compiled from: PG */
public final class C12248ak extends C68247h {

    /* renamed from: a */
    private final C68283d f39003a;

    /* renamed from: c */
    private final C69464a f39004c;

    /* renamed from: d */
    private final C68283d f39005d;

    /* renamed from: e */
    private final C68283d f39006e;

    /* renamed from: f */
    private final C68283d f39007f;

    public C12248ak(C69464a aVar, C69464a aVar2, C68283d dVar, C69464a aVar3, C68283d dVar2, C68283d dVar3, C68283d dVar4) {
        super(aVar2, new C68277d(C12248ak.class), aVar);
        this.f39003a = C68236af.m98549d(dVar);
        this.f39004c = aVar3;
        this.f39005d = C68236af.m98549d(dVar2);
        this.f39006e = C68236af.m98549d(dVar3);
        this.f39007f = C68236af.m98549d(dVar4);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        String str;
        List list = (List) obj;
        C15591d dVar = (C15591d) list.get(0);
        C69464a aVar = this.f39004c;
        boolean booleanValue = ((Boolean) list.get(1)).booleanValue();
        C37215b bVar = (C37215b) list.get(2);
        C15592a aVar2 = (C15592a) list.get(3);
        if (!booleanValue) {
            C59104x c = C12244ag.f38995a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "PopOrchestration");
            ((C59052c) ((C59052c) c).mo56372aa(44159)).mo56386p("POP stack is NOT enabled. Returning an empty response.");
            aVar2.f46630b = true;
            aVar2.f46631c.add("POP not enabled. Please enable POP flag in mobile utilities");
            ((C59052c) ((C59052c) C15592a.f46629a.mo56224b()).mo56372aa(46173)).mo56386p("Sending notification for set up");
            if (((Boolean) aVar2.f46634f.mo17428b()).booleanValue() && aVar2.f46630b) {
                C1839z zVar = new C1839z(aVar2.f46633e, "SETUP_NOTIFICATION_CHANNEL");
                zVar.f5685e = C1839z.m5037c(true != aVar2.f46630b ? "Set up succeeded!" : "Set up failed!");
                if (aVar2.f46630b) {
                    ArrayList arrayList = aVar2.f46631c;
                    String str2 = "Error! : ";
                    for (int i = 0; i < arrayList.size(); i++) {
                        str2 = str2 + " " + ((String) arrayList.get(i)) + " ";
                    }
                    str = str2.concat(" go/auto-offline-debug-notifications");
                } else {
                    str = "Set up successful!";
                }
                zVar.f5686f = C1839z.m5037c(str);
                zVar.f5679J.icon = R.drawable.product_logo_assistant_color_24;
                zVar.f5690j = 2;
                aVar2.f46632d.notify(1, zVar.mo5013a());
            }
            aVar2.f46630b = false;
            aVar2.f46631c.clear();
            return C60856cj.m92900i(C58836b.f156633a);
        }
        bVar.mo19974a(C37179a.f97536cB);
        C59104x b = C12244ag.f38995a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "PopOrchestration");
        ((C59052c) ((C59052c) b).mo56372aa(44157)).mo56386p("Sending query to POP host.");
        dVar.mo22410c();
        C15561a aVar3 = (C15561a) aVar.mo17428b();
        if (!aVar3.f46559a) {
            return C60856cj.m92900i(C58836b.f156633a);
        }
        C57934a a = aVar3.f46560b.mo54628a("AapPortableAssistantQueryGraph");
        C73952bc bcVar = aVar3.f46561c;
        bcVar.f205139d = a;
        dVar.getClass();
        bcVar.f205138c = dVar;
        C65176ej ejVar = C65176ej.f176380b;
        ejVar.getClass();
        bcVar.f205140e = ejVar;
        C62799s sVar = C62799s.f169588g;
        sVar.getClass();
        bcVar.f205141f = sVar;
        C68225k.m98529a(bcVar.f205138c, C15591d.class);
        C68225k.m98529a(bcVar.f205139d, C57934a.class);
        C68225k.m98529a(bcVar.f205140e, C65176ej.class);
        C68225k.m98529a(bcVar.f205141f, C62799s.class);
        return new be(bcVar.f205136a, bcVar.f205137b, bcVar.f205138c, bcVar.f205139d, bcVar.f205141f).b.mo60297gq();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f39003a.mo60297gq(), this.f39005d.mo60297gq(), this.f39006e.mo60297gq(), this.f39007f.mo60297gq());
    }
}
