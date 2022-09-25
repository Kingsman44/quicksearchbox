package com.google.android.apps.gsa.staticplugins.p7417av;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.gsa.shared.p7066m.C89981at;
import com.google.android.libraries.gcoreclient.p1776l.p1777a.C21574a;
import com.google.android.libraries.gcoreclient.p1776l.p1777a.C21575b;
import com.google.android.libraries.gcoreclient.p1776l.p1777a.C21576c;
import com.google.android.libraries.gsa.p1876k.C22870f;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.firebase.C61204g;
import com.google.firebase.C61269n;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.android.apps.gsa.staticplugins.av.a */
/* compiled from: PG */
public final /* synthetic */ class C94139a implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ C94142c f263006a;

    public /* synthetic */ C94139a(C94142c cVar) {
        this.f263006a = cVar;
    }

    public final void run() {
        ArrayList arrayList;
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks;
        C94142c cVar = this.f263006a;
        ArrayList arrayList2 = new ArrayList();
        synchronized (C61204g.f165553a) {
            arrayList = new ArrayList(C61204g.f165554b.values());
        }
        Iterator it = arrayList.iterator();
        while (true) {
            activityLifecycleCallbacks = null;
            if (!it.hasNext()) {
                break;
            }
            C61204g gVar = (C61204g) it.next();
            arrayList2.add(new C21574a((byte[]) null));
        }
        if (arrayList2.isEmpty()) {
            C21575b bVar = cVar.f263011d;
            bVar.f59960a = C61269n.m93754a(cVar.f263009b);
            C61204g.m93579c(cVar.f263009b, ((C21576c) bVar).f59960a, "[DEFAULT]");
            if (cVar.f263010c.mo79746e(C89981at.f246641k)) {
                try {
                    Context context = cVar.f263009b;
                    if (context instanceof Application) {
                        Application application = (Application) context;
                        int i = 0;
                        Method declaredMethod = Application.class.getDeclaredMethod("collectActivityLifecycleCallbacks", new Class[0]);
                        declaredMethod.setAccessible(true);
                        Object[] objArr = (Object[]) declaredMethod.invoke(application, new Object[0]);
                        if (objArr != null) {
                            int length = objArr.length;
                            while (true) {
                                if (i >= length) {
                                    break;
                                }
                                Object obj = objArr[i];
                                Package packageR = obj.getClass().getPackage();
                                if (packageR != null && TextUtils.equals(packageR.getName(), "com.google.android.gms.internal")) {
                                    activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) obj;
                                    break;
                                }
                                i++;
                            }
                        }
                        if (activityLifecycleCallbacks != null) {
                            C58976aa aaVar = C58975e.f156826a;
                            application.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
                            application.registerActivityLifecycleCallbacks(new C94141b(activityLifecycleCallbacks));
                            return;
                        }
                        C59104x d = C94142c.f263008a.mo56226d();
                        d.mo56378ag(C58975e.f156826a, "FirebaseInitializer");
                        ((C59052c) ((C59052c) d).mo56372aa(19963)).mo56386p("Could not find Firebase activity lifecycle callbacks");
                    }
                } catch (Exception e) {
                    C59104x c = C94142c.f263008a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "FirebaseInitializer");
                    ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(19962)).mo56386p("Could not replace Firebase activity lifecycle callbacks");
                }
            }
        }
    }
}
