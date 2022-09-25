package com.google.android.libraries.assistant.assistantactions.p621c.p623b.p626c;

import com.google.assistant.p3897e.p3902c.p3907c.C50947as;
import com.google.assistant.p3897e.p3902c.p3907c.C50951aw;
import com.google.assistant.p3897e.p3902c.p3907c.C50954az;
import com.google.assistant.p3897e.p3921j.C52393qb;
import com.google.protos.p4850an.p4853b.C63358b;
import com.google.protos.p4850an.p4853b.C63360d;
import com.google.protos.p4850an.p4853b.C63378v;
import p3186j$.time.LocalDate;
import p3186j$.time.ZoneId;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.b.c.ar */
/* compiled from: PG */
public final /* synthetic */ class C11155ar implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C11139ab f36526a;

    public /* synthetic */ C11155ar(C11139ab abVar) {
        this.f36526a = abVar;
    }

    public final void accept(Object obj) {
        C52393qb qbVar;
        C50951aw awVar;
        C11139ab abVar = this.f36526a;
        C50947as asVar = (C50947as) obj;
        int i = C11160aw.f36531a;
        if (abVar.f36504b.isPresent()) {
            C52393qb qbVar2 = (C52393qb) abVar.f36504b.get();
            C50954az azVar = (C50954az) asVar.instance;
            if (azVar.f132642b == 3) {
                qbVar = (C52393qb) azVar.f132643c;
            } else {
                qbVar = C52393qb.f137479e;
            }
            if (C11160aw.m26450c(qbVar2, qbVar)) {
                if (abVar.f36507e.isPresent() && ((C63360d) abVar.f36507e.get()).f171234c.size() != 0) {
                    C63358b bVar = (C63358b) ((C63360d) abVar.f36507e.get()).f171234c.get(0);
                    int i2 = 1;
                    if ((bVar.f171218a & 1) != 0) {
                        int i3 = bVar.f171219b;
                        int a = C63378v.m96231a(bVar.f171220c);
                        if (a != 0) {
                            i2 = a;
                        }
                        if (!LocalDate.m71157of(i3, i2 - 1, bVar.f171221d).isBefore(abVar.f36503a.mo57445b(ZoneId.systemDefault()))) {
                            awVar = C50951aw.HIGHLIGHT;
                            asVar.copyOnWrite();
                            C50954az azVar2 = (C50954az) asVar.instance;
                            azVar2.f132649i = awVar.f132637f;
                            azVar2.f132641a |= 1024;
                            return;
                        }
                    }
                }
                awVar = C50951aw.ERROR;
                asVar.copyOnWrite();
                C50954az azVar22 = (C50954az) asVar.instance;
                azVar22.f132649i = awVar.f132637f;
                azVar22.f132641a |= 1024;
                return;
            }
        }
        C50951aw a2 = C50951aw.m85988a(((C50954az) asVar.instance).f132649i);
        if (a2 == null) {
            a2 = C50951aw.DEFAULT_STATUS;
        }
        if (a2 != C50951aw.HIDDEN) {
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
