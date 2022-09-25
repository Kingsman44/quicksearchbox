package com.google.android.libraries.social.peoplekit.configs.p3284a;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.util.Log;
import com.google.android.libraries.p1623at.p1624a.C19458a;
import com.google.android.libraries.social.p3260a.p3261a.p3262a.C41902a;
import com.google.android.libraries.social.p3260a.p3265d.C41908a;
import com.google.android.libraries.social.p3260a.p3265d.C41909b;
import com.google.android.libraries.social.p3260a.p3265d.C41910c;
import com.google.android.libraries.social.p3260a.p3265d.C41911d;
import com.google.android.libraries.social.p3260a.p3265d.C41912e;
import com.google.android.libraries.social.p3269d.p3270a.C41937l;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.android.libraries.social.peoplekit.configs.C42144d;
import com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig;
import com.google.android.libraries.social.peoplekit.configs.PeopleKitConfigImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.libraries.social.peoplekit.configs.a.a */
/* compiled from: PG */
public final class C42140a {
    /* renamed from: a */
    public static PeopleKitConfig m73963a(Context context, String str) {
        C41909b bVar;
        Intent intent;
        C42144d dVar = new C42144d();
        dVar.f110308a = str;
        dVar.f110318k = 82;
        dVar.f110309b = C41937l.ASSISTANT_HOUSEHOLD_CONTACTS_DEFAULT;
        dVar.f110313f = false;
        dVar.f110314g = true;
        dVar.f110316i = false;
        dVar.f110317j = true;
        dVar.f110315h = true;
        dVar.f110311d = true;
        dVar.f110312e = true;
        C41909b bVar2 = new C41909b();
        C19458a a = C19458a.m37144a(context);
        Class<C41910c> cls = C41910c.class;
        ArrayList arrayList = new ArrayList();
        Object b = a.mo24648b(cls);
        if (b != null) {
            arrayList.add(b);
        }
        C19458a aVar = a.f54400b;
        for (int i = 0; i < arrayList.size(); i++) {
            C41908a a2 = ((C41910c) arrayList.get(i)).mo44373a();
            if (a2 != null) {
                bVar2.f109314a.add(a2);
            }
        }
        if (!bVar2.f109314a.isEmpty()) {
            List list = bVar2.f109314a;
            C41911d dVar2 = ((C41908a) list.get(list.size() - 1)).f109313a;
        }
        if (Log.isLoggable("VisualElementPath", 3)) {
            Log.d("VisualElementPath", "Didn't find RootPage VE, querying deferredVisualElementProvider");
        }
        C41902a aVar2 = (C41902a) a.mo24649c(C41902a.class);
        if (aVar2 != null) {
            if (Log.isLoggable("VisualElementPath", 3)) {
                Log.d("VisualElementPath", "Found deferredVisualElementProvider");
            }
            C41908a a3 = aVar2.mo44373a();
            if (a3 != null) {
                bVar2.f109314a.add(a3);
                if (Log.isLoggable("VisualElementPath", 3)) {
                    Log.d("VisualElementPath", String.format(Locale.US, "Found VE: %s resulting path: %s", new Object[]{a3, C41912e.m73437a(bVar2.f109314a)}));
                }
            }
        }
        while (true) {
            bVar = null;
            if (!(context instanceof Activity)) {
                if (!(context instanceof ContextWrapper)) {
                    intent = null;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                intent = ((Activity) context).getIntent();
                break;
            }
        }
        if (intent != null) {
            try {
                bVar = (C41909b) intent.getSerializableExtra("analytics$VisualElementPath");
            } catch (Throwable th) {
                if (Log.isLoggable("VisualElementPath", 6)) {
                    Log.e("VisualElementPath", "Unable to deserialize path", th);
                }
            }
            if (bVar != null) {
                bVar2.f109314a.addAll(bVar.f109314a);
            }
        }
        dVar.f110310c = new PeopleKitVisualElementPath();
        dVar.f110310c.mo44564a(bVar2);
        return new PeopleKitConfigImpl(dVar);
    }
}
