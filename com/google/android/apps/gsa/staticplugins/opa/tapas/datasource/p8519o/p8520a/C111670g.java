package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o.p8520a;

import android.net.Uri;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111248k;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111255r;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.grammar.pumpkin.C66521m;
import com.google.speech.grammar.pumpkin.C66523o;
import com.google.speech.grammar.pumpkin.C66525q;
import java.util.Iterator;
import java.util.concurrent.Callable;
import org.p5633c.p5634a.C72299w;
import org.p5633c.p5634a.p5639e.C72234a;
import p3186j$.util.DateRetargetClass;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.a.g */
/* compiled from: PG */
public final /* synthetic */ class C111670g implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C111671h f310448a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f310449b;

    /* renamed from: c */
    public final /* synthetic */ String f310450c;

    /* renamed from: d */
    public final /* synthetic */ Uri.Builder f310451d;

    public /* synthetic */ C111670g(C111671h hVar, C60870cx cxVar, String str, Uri.Builder builder) {
        this.f310448a = hVar;
        this.f310449b = cxVar;
        this.f310450c = str;
        this.f310451d = builder;
    }

    public final Object call() {
        int i;
        C72299w wVar;
        C111671h hVar = this.f310448a;
        C60870cx cxVar = this.f310449b;
        String str = this.f310450c;
        Uri.Builder builder = this.f310451d;
        C58485gu guVar = (C58485gu) C60856cj.m92909r(cxVar);
        int size = guVar.size();
        int i2 = 0;
        while (i2 < size) {
            Iterator it = ((C66525q) guVar.get(i2)).f180933c.iterator();
            while (true) {
                i = i2 + 1;
                if (!it.hasNext()) {
                    break;
                }
                C66521m mVar = (C66521m) it.next();
                C58976aa aaVar = C58975e.f156826a;
                String str2 = mVar.f180922b;
                int i3 = mVar.f180923c;
                float f = mVar.f180924d;
                String str3 = mVar.f180925e;
                String str4 = mVar.f180926f;
                int a = C66523o.m97239a(mVar.f180923c);
                if (a != 0 && a == 7) {
                    C72299w e = C72234a.m106517a("MM/dd/yyyy").mo63599e(mVar.f180925e);
                    int i4 = 1;
                    long b = e.f192456b.mo63327E().mo63474b(e.f192455a, 1);
                    int i5 = i2;
                    if (b == e.f192455a) {
                        wVar = e;
                    } else {
                        wVar = new C72299w(b, e.f192456b);
                    }
                    builder.appendQueryParameter("dateTimeRangeStart", String.valueOf(DateRetargetClass.toInstant(e.mo63689o()).getEpochSecond())).appendQueryParameter("dateTimeRangeEnd", String.valueOf(DateRetargetClass.toInstant(wVar.mo63689o()).getEpochSecond()));
                    C111248k kVar = hVar.f310456b;
                    C111255r rVar = C111255r.APP_ACTIONS_SLICE;
                    Object[] objArr = new Object[8];
                    objArr[0] = str;
                    objArr[1] = mVar.f180922b;
                    int a2 = C66523o.m97239a(mVar.f180923c);
                    if (a2 != 0) {
                        i4 = a2;
                    }
                    objArr[2] = Integer.valueOf(i4 - 2);
                    objArr[3] = Float.valueOf(mVar.f180924d);
                    objArr[4] = mVar.f180925e;
                    objArr[5] = mVar.f180926f;
                    objArr[6] = Long.valueOf(DateRetargetClass.toInstant(e.mo63689o()).getEpochSecond());
                    objArr[7] = Long.valueOf(DateRetargetClass.toInstant(wVar.mo63689o()).getEpochSecond());
                    kVar.mo99076a(rVar, String.format("query (%s): argument (%s) - type (%d) score (%f) value (%s) unnormalized value (%s) dateTimeRangeStart (%d) dateTimeRangeEnd (%d)", objArr));
                    i2 = i5;
                }
            }
            i2 = i;
        }
        String uri = builder.build().toString();
        hVar.f310456b.mo99076a(C111255r.APP_ACTIONS_SLICE, uri);
        return Optional.m71637of(uri);
    }
}
