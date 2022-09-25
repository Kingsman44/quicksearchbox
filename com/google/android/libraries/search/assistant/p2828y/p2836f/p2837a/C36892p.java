package com.google.android.libraries.search.assistant.p2828y.p2836f.p2837a;

import android.text.TextUtils;
import com.google.android.libraries.search.assistant.p2828y.p2836f.C36906e;
import com.google.assistant.p3897e.p3917i.p3918a.C51500k;
import com.google.assistant.p3897e.p3917i.p3918a.C51527l;
import com.google.assistant.p3897e.p3917i.p3918a.C51565mk;
import com.google.assistant.p3897e.p3917i.p3918a.C51566ml;
import com.google.assistant.p3897e.p3917i.p3918a.C51593nl;
import com.google.assistant.p3897e.p3917i.p3918a.C51594nm;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.knowledge.p4671b.C61817j;
import com.google.knowledge.p4671b.C61818k;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.search.assistant.y.f.a.p */
/* compiled from: PG */
public final /* synthetic */ class C36892p implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C36899w f96060a;

    /* renamed from: b */
    public final /* synthetic */ C36885i f96061b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f96062c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f96063d;

    /* renamed from: e */
    public final /* synthetic */ C36906e f96064e;

    public /* synthetic */ C36892p(C36899w wVar, C36885i iVar, C60870cx cxVar, C60870cx cxVar2, C36906e eVar) {
        this.f96060a = wVar;
        this.f96061b = iVar;
        this.f96062c = cxVar;
        this.f96063d = cxVar2;
        this.f96064e = eVar;
    }

    public final Object call() {
        C36899w wVar = this.f96060a;
        C36885i iVar = this.f96061b;
        C60870cx cxVar = this.f96062c;
        C60870cx cxVar2 = this.f96063d;
        C36906e eVar = this.f96064e;
        C51500k kVar = (C51500k) iVar.mo40435a().toBuilder();
        C51593nl nlVar = (C51593nl) iVar.mo40437c().toBuilder();
        C51565mk mkVar = (C51565mk) iVar.mo40436b().toBuilder();
        String str = (String) C60856cj.m92909r(cxVar);
        String str2 = (String) C60856cj.m92909r(cxVar2);
        if (!TextUtils.isEmpty(str)) {
            kVar.copyOnWrite();
            C51527l lVar = (C51527l) kVar.instance;
            str.getClass();
            lVar.f134275a |= 8;
            lVar.f134279e = str;
        }
        if (!TextUtils.isEmpty(str2)) {
            nlVar.copyOnWrite();
            C51594nm nmVar = (C51594nm) nlVar.instance;
            str2.getClass();
            nmVar.f134476a |= 4;
            nmVar.f134480e = str2;
        }
        wVar.mo40449f(kVar, eVar);
        wVar.mo40450g(nlVar, eVar);
        C61817j jVar = (C61817j) C61818k.f166999r.createBuilder();
        C36879c.m65575a(jVar, "alarm", "assistant.api.params.AlarmParams", (C51527l) kVar.build());
        C36879c.m65575a(jVar, "timer", "assistant.api.params.TimerParams", (C51594nm) nlVar.build());
        C36879c.m65575a(jVar, "stopwatch", "assistant.api.params.StopwatchParams", (C51566ml) mkVar.build());
        return (C61818k) jVar.build();
    }
}
