package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl;

import com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.C14782b;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.p1083a.C14734d;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.af */
/* compiled from: PG */
public final /* synthetic */ class C14791af implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C14794ai f44569a;

    /* renamed from: b */
    public final /* synthetic */ C58485gu f44570b;

    public /* synthetic */ C14791af(C14794ai aiVar, C58485gu guVar) {
        this.f44569a = aiVar;
        this.f44570b = guVar;
    }

    public final Object call() {
        C14794ai aiVar = this.f44569a;
        C58485gu guVar = this.f44570b;
        int i = 0;
        aiVar.f44578f = false;
        int size = guVar.size();
        while (i < size) {
            try {
                if (((C14782b) C60856cj.m92909r((C60870cx) guVar.get(i))) == C14782b.SUCCESS) {
                    aiVar.f44575c.mo21875g(C14734d.m31018a());
                    aiVar.f44576d.mo22279a();
                    return C14782b.SUCCESS;
                }
                i++;
            } catch (RuntimeException | ExecutionException e) {
                C59104x c = C14794ai.f44573a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "Morris.ReqCallbkHndlr");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(45529)).mo56386p("DataSource future failed");
            }
        }
        aiVar.f44576d.mo22279a();
        return C14782b.FAILED;
    }
}
