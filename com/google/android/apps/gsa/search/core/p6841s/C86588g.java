package com.google.android.apps.gsa.search.core.p6841s;

import android.accounts.Account;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.p6968aa.C89009ag;
import com.google.android.apps.gsa.shared.p6968aa.C89012aj;
import com.google.android.apps.gsa.shared.p6968aa.C89019aq;
import com.google.android.apps.gsa.shared.p6968aa.C89020ar;
import com.google.android.apps.gsa.shared.p6968aa.C89057m;
import com.google.android.apps.gsa.shared.p6968aa.C89066v;
import com.google.android.apps.gsa.shared.p7066m.C90109fg;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.sidekick.main.p7199b.C91262b;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p375ai.p378b.C7829lm;
import com.google.p375ai.p378b.C7832lp;
import java.nio.ByteBuffer;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.apps.gsa.search.core.s.g */
/* compiled from: PG */
final class C86588g extends C86584c {

    /* renamed from: b */
    final /* synthetic */ C86590i f233913b;

    /* renamed from: c */
    private final C86589h f233914c;

    /* renamed from: d */
    private final boolean f233915d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86588g(C86590i iVar, C86589h hVar, boolean z) {
        super(iVar);
        this.f233913b = iVar;
        this.f233914c = hVar;
        this.f233915d = z;
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo80200b(Account account, Map map) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("enable_history_recording", this.f233915d);
            jSONObject.put("client", this.f233914c.mo80203a(this.f233913b.f233926d));
            String a = this.f233913b.f233930h.mo85530a(account);
            if (a != null) {
                jSONObject.put("version_info", a);
            }
            C89019aq d = C89020ar.m144759d();
            d.mo82994f(this.f233913b.f233927e.mo79758x(C90109fg.f250570l));
            d.mo82991c(map);
            d.f241245k = 2;
            d.f241244j = false;
            C89020ar a2 = d.mo82989a();
            C58976aa aaVar = C58975e.f156826a;
            String string = new JSONObject(((C89057m) C90877ak.m148472f(((C89012aj) this.f233913b.f233924b.mo27525b()).mo27495f(a2, C89009ag.m144715a(ByteBuffer.wrap(jSONObject.toString().getBytes(C90772bp.f253863a)), this.f233913b.f233932j), ((C89012aj) this.f233913b.f233924b.mo27525b()).mo27510b(C89066v.f241382a)))).mo83035e()).getString("version_info");
            if (!C58837ba.m90859h(string)) {
                C91262b bVar = this.f233913b.f233930h;
                if (account.equals(((C86054o) bVar.f254708b.mo27525b()).mo79668a())) {
                    C7829lm lmVar = (C7829lm) C7832lp.f27462d.createBuilder();
                    lmVar.copyOnWrite();
                    C7832lp lpVar = (C7832lp) lmVar.instance;
                    lpVar.f27465b = 2;
                    lpVar.f27464a |= 1;
                    lmVar.copyOnWrite();
                    C7832lp lpVar2 = (C7832lp) lmVar.instance;
                    string.getClass();
                    lpVar2.f27464a |= 2;
                    lpVar2.f27466c = string;
                    bVar.mo85532c(C58485gu.m89846n((C7832lp) lmVar.build()));
                }
                this.f233913b.f233930h.mo85535f(2, string);
            }
            return true;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
}
