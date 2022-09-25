package com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.p9441a;

import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125650ac;
import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125666as;
import java.util.List;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69663m;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69759h;
import p5462h.p5483m.C69762k;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.a.cm */
/* compiled from: PG */
final /* synthetic */ class C125601cm extends C69663m implements C69626l {
    public C125601cm(Object obj) {
        super(1, obj, C125599ck.class, "matchMoveToField", "matchMoveToField(Ljava/lang/String;)Lcom/google/android/apps/search/assistant/surfaces/dictation/service/fulfillment/nlu/hardcoded/MoveToField;", 0);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        List a;
        String str;
        C125666as asVar;
        String str2 = (String) obj;
        C69664n.m101061g(str2, "p0");
        C125599ck ckVar = (C125599ck) this.f186034c;
        int hashCode = str2.hashCode();
        if (hashCode != -1950513066) {
            if (hashCode != -1313201436) {
                if (hashCode == 2142231748 && str2.equals("件名の設定")) {
                    return new C125650ac(C125666as.SUBJECT);
                }
            } else if (str2.equals("受信者を設定")) {
                return new C125650ac(C125666as.RECIPIENT);
            }
        } else if (str2.equals("懸命の設定")) {
            return new C125650ac(C125666as.SUBJECT);
        }
        C69759h c = ((C69762k) C125608ct.f346241c.mo5768a()).mo61435c(str2);
        C125650ac acVar = null;
        if (!(c == null || (a = c.mo61432a()) == null || (str = (String) a.get(1)) == null || (asVar = (C125666as) C125608ct.f346248j.get(str)) == null)) {
            acVar = new C125650ac(asVar);
        }
        return acVar;
    }
}
