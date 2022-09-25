package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113132aq;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113390ea;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113391eb;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113396eg;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113397eh;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113321r;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121509q;
import com.google.android.libraries.searchbox.shared.suggestion.C41689o;
import com.google.common.p4526f.C59052c;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.ez */
/* compiled from: PG */
public final /* synthetic */ class C112418ez implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C112433ff f311899a;

    /* renamed from: b */
    public final /* synthetic */ Map f311900b;

    /* renamed from: c */
    public final /* synthetic */ Map f311901c;

    /* renamed from: d */
    public final /* synthetic */ Set f311902d;

    public /* synthetic */ C112418ez(C112433ff ffVar, Map map, Map map2, Set set) {
        this.f311899a = ffVar;
        this.f311900b = map;
        this.f311901c = map2;
        this.f311902d = set;
    }

    public final void run() {
        String str;
        C112433ff ffVar = this.f311899a;
        Map map = this.f311900b;
        Map map2 = this.f311901c;
        Set set = this.f311902d;
        C121537f fVar = C112435fh.f311928a;
        C113415ez ezVar = ffVar.f311924a;
        C121509q l = C113132aq.f313446b.mo105243l("getContactIdBySuggestion");
        try {
            if (!ezVar.mo100220t().isPresent() || ((List) ezVar.mo100220t().get()).isEmpty()) {
                C41689o oVar = ezVar.mo100209i().f109010d;
                if (oVar == null) {
                    oVar = C41689o.f109041e;
                }
                if (oVar.f109045c.equals("contacts_contact_id")) {
                    C41689o oVar2 = ezVar.mo100209i().f109010d;
                    if (oVar2 == null) {
                        oVar2 = C41689o.f109041e;
                    }
                    if ((oVar2.f109043a & 1) != 0) {
                        C41689o oVar3 = ezVar.mo100209i().f109010d;
                        if (oVar3 == null) {
                            oVar3 = C41689o.f109041e;
                        }
                        str = Long.toString(Long.parseLong(oVar3.f109044b));
                    }
                }
                str = null;
            } else {
                str = ((C113321r) ((List) ezVar.mo100220t().get()).get(0)).f313838e;
            }
        } catch (NumberFormatException e) {
            C59052c cVar = (C59052c) ((C59052c) ((C59052c) C113132aq.f313447c.mo56226d()).mo56382g(e)).mo56372aa(27960);
            C41689o oVar4 = ezVar.mo100209i().f109010d;
            if (oVar4 == null) {
                oVar4 = C41689o.f109041e;
            }
            cVar.mo56389s("Could not parse contact id: %s", oVar4.f109044b);
        } catch (Throwable th) {
            try {
                l.close();
            } catch (Throwable th2) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th2});
                } catch (Exception unused) {
                }
            }
            throw th;
        }
        l.close();
        if (str != null) {
            C113391eb ebVar = ((C113397eh) ffVar.f311925b.instance).f314003b;
            if (ebVar == null) {
                ebVar = C113391eb.f313979e;
            }
            C113390ea eaVar = (C113390ea) ebVar.toBuilder();
            boolean contains = set.contains(str);
            eaVar.copyOnWrite();
            C113391eb ebVar2 = (C113391eb) eaVar.instance;
            ebVar2.f313981a |= 2;
            ebVar2.f313982b = contains;
            if (map.containsKey(str)) {
                float floatValue = ((Double) map.get(str)).floatValue();
                eaVar.copyOnWrite();
                C113391eb ebVar3 = (C113391eb) eaVar.instance;
                ebVar3.f313981a |= 4;
                ebVar3.f313983c = floatValue;
            }
            if (map2.containsKey(str)) {
                float floatValue2 = ((Double) map2.get(str)).floatValue();
                eaVar.copyOnWrite();
                C113391eb ebVar4 = (C113391eb) eaVar.instance;
                ebVar4.f313981a |= 8;
                ebVar4.f313984d = floatValue2;
            }
            C113396eg egVar = ffVar.f311925b;
            egVar.copyOnWrite();
            C113397eh ehVar = (C113397eh) egVar.instance;
            C113391eb ebVar5 = (C113391eb) eaVar.build();
            ebVar5.getClass();
            ehVar.f314003b = ebVar5;
            ehVar.f314002a |= 1;
        }
    }
}
