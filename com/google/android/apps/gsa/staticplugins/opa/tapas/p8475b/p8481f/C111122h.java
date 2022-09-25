package com.google.android.apps.gsa.staticplugins.opa.tapas.p8475b.p8481f;

import android.database.Cursor;
import android.provider.ContactsContract;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g.C112473ar;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113304aa;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113306c;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113308e;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113311h;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113318o;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113325v;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.HashSet;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.b.f.h */
/* compiled from: PG */
public final class C111122h extends C112473ar {

    /* renamed from: a */
    public final C21370a f309373a;

    /* renamed from: b */
    private final C22871g f309374b;

    /* renamed from: c */
    private final C113306c f309375c;

    public C111122h(C22871g gVar, C21370a aVar, C113306c cVar) {
        this.f309374b = gVar;
        this.f309373a = aVar;
        this.f309375c = cVar;
    }

    /* renamed from: b */
    public final C60870cx mo99044b() {
        C58485gu guVar;
        C22871g gVar = this.f309374b;
        C113318o oVar = (C113318o) this.f309375c;
        C22871g gVar2 = oVar.f313822j;
        C113304aa aaVar = (C113304aa) oVar.f313821i.mo27525b();
        if (!aaVar.mo100108a()) {
            guVar = C58485gu.m89845m();
        } else {
            C58480gp e = C58485gu.m89837e();
            Cursor query = aaVar.f313793e.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, C113304aa.f313791c, "display_name IS NOT NULL AND starred = 1 ", (String[]) null, "starred DESC, custom_ringtone DESC");
            if (query == null) {
                try {
                    guVar = C58485gu.m89845m();
                } catch (Throwable th) {
                    C113325v.m187489a(th, th);
                }
            } else {
                HashSet hashSet = new HashSet();
                while (query.moveToNext()) {
                    String string = query.getString(query.getColumnIndex("display_name"));
                    if (!(query.getString(query.getColumnIndex("data1")) == null || string == null || !hashSet.add(string))) {
                        e.mo55395g(string);
                    }
                }
                query.close();
                guVar = e.mo55394f();
            }
        }
        return gVar.mo28209i(gVar2.mo28209i(C60856cj.m92906o((List) Collection.EL.stream(guVar).map(new C113308e(oVar)).collect(Collectors.toList())), "transform contact id", new C113311h(oVar)), "getStarredContactInfos", new C111119e(this));
        throw th;
    }
}
