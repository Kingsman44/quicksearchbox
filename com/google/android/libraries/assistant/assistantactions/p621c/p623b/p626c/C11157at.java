package com.google.android.libraries.assistant.assistantactions.p621c.p623b.p626c;

import com.google.assistant.p3897e.p3902c.p3907c.C50947as;
import com.google.assistant.p3897e.p3902c.p3907c.C50951aw;
import com.google.assistant.p3897e.p3902c.p3907c.C50954az;
import com.google.assistant.p3897e.p3921j.C52397qf;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.b.c.at */
/* compiled from: PG */
public final /* synthetic */ class C11157at implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C11139ab f36528a;

    public /* synthetic */ C11157at(C11139ab abVar) {
        this.f36528a = abVar;
    }

    public final void accept(Object obj) {
        C52397qf qfVar;
        C11139ab abVar = this.f36528a;
        C50947as asVar = (C50947as) obj;
        int i = C11160aw.f36531a;
        if (abVar.f36506d.isPresent()) {
            C52397qf qfVar2 = (C52397qf) abVar.f36506d.get();
            C50954az azVar = (C50954az) asVar.instance;
            if (azVar.f132642b == 6) {
                qfVar = (C52397qf) azVar.f132643c;
            } else {
                qfVar = C52397qf.f137491j;
            }
            if (qfVar2.equals(qfVar)) {
                C50951aw awVar = C50951aw.HIGHLIGHT;
                asVar.copyOnWrite();
                C50954az azVar2 = (C50954az) asVar.instance;
                azVar2.f132649i = awVar.f132637f;
                azVar2.f132641a |= 1024;
                return;
            }
        }
        C50951aw a = C50951aw.m85988a(((C50954az) asVar.instance).f132649i);
        if (a == null) {
            a = C50951aw.DEFAULT_STATUS;
        }
        if (a != C50951aw.HIDDEN) {
            C50951aw awVar2 = C50951aw.DEFAULT_STATUS;
            asVar.copyOnWrite();
            C50954az azVar3 = (C50954az) asVar.instance;
            azVar3.f132649i = awVar2.f132637f;
            azVar3.f132641a |= 1024;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
