package com.google.android.libraries.social.populous.android;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.social.populous.AutocompleteSession;
import com.google.android.libraries.social.populous.C42206bk;
import com.google.android.libraries.social.populous.C42556g;
import com.google.android.libraries.social.populous.core.ClientConfigInternal;
import com.google.android.libraries.social.populous.core.ContactMethodField;
import com.google.android.libraries.social.populous.core.ProfileId;
import com.google.android.libraries.social.populous.core.SessionContext;
import com.google.android.libraries.social.populous.logging.C42573h;
import com.google.android.libraries.social.populous.logging.C42575j;
import com.google.android.libraries.social.populous.logging.C42576k;
import com.google.android.libraries.social.populous.logging.C42586u;
import com.google.android.libraries.social.populous.logging.C42589x;
import com.google.android.libraries.social.populous.logging.C42590y;
import com.google.android.libraries.social.populous.logging.C42591z;
import com.google.android.libraries.social.populous.p3296e.p3298b.C42403a;
import com.google.android.libraries.social.populous.p3296e.p3299c.C42454ae;
import com.google.android.libraries.social.populous.p3296e.p3299c.C42475b;
import com.google.android.libraries.social.populous.p3296e.p3299c.C42476c;
import com.google.common.base.C58872ci;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* compiled from: PG */
public class AndroidLibAutocompleteSession extends AutocompleteSession implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C42164c();

    /* renamed from: u */
    public static final String f110424u = AutocompleteSession.class.getSimpleName();

    /* renamed from: v */
    public Context f110425v;

    /* renamed from: w */
    public C60887da f110426w;

    /* renamed from: x */
    public final String f110427x;

    /* renamed from: y */
    public C42475b f110428y;

    /* renamed from: z */
    private final C60870cx f110429z;

    public AndroidLibAutocompleteSession(String str, ClientConfigInternal clientConfigInternal, C42206bk bkVar, Executor executor, SessionContext sessionContext, C60870cx cxVar, C42586u uVar) {
        super(clientConfigInternal, bkVar, executor, sessionContext, uVar);
        str.getClass();
        this.f110427x = str;
        this.f110429z = cxVar;
    }

    /* renamed from: r */
    static boolean m74073r(SessionContext sessionContext) {
        C58485gu guVar = sessionContext.f110810d;
        int size = guVar.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (((ContactMethodField) guVar.get(i)) instanceof ProfileId) {
                return true;
            }
            i = i2;
        }
        return false;
    }

    /* renamed from: b */
    public final synchronized C60870cx mo44814b() {
        C42575j jVar = new C42575j();
        jVar.f111732c = Long.valueOf(this.f110353n);
        C42576k a = jVar.mo45662a();
        C58872ci d = this.f110342c.mo45634d(12, 0, 0, a);
        C42556g gVar = new C42556g(this.f110340a, this.f110355p, this.f110346g);
        if (this.f110426w != null) {
            if (this.f110428y == null) {
                this.f110428y = new C42475b(new C42476c(), this.f110425v, this.f110340a, new C42403a(Locale.getDefault()), this.f110342c);
            }
            return this.f110426w.mo19399b(new C42161a(this, a, gVar, d));
        }
        C42591z zVar = this.f110342c;
        C42589x g = C42590y.m75179g();
        ((C42573h) g).f111717a = d;
        g.mo45652c(2);
        zVar.mo45637g(12, 3, g.mo45650a(), 0, a);
        return C60856cj.m92900i(gVar.mo45559a(C58485gu.m89845m()));
    }

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final List mo44816e() {
        return new CopyOnWriteArrayList();
    }

    /* renamed from: n */
    public final void mo44825n(String str) {
        this.f110357r = C42454ae.m74855h(this.f110425v);
        if (this.f110429z == null || m74073r(this.f110351l.mo45315a())) {
            super.mo44825n(str);
        } else {
            C60856cj.m92911t(this.f110429z, new C42163b(this, str), C60826bg.f164896a);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f110340a, 0);
        parcel.writeString(this.f110427x);
        parcel.writeParcelable(this.f110351l.mo45315a(), 0);
        parcel.writeLong(this.f110353n);
        parcel.writeLong(this.f110354o);
        parcel.writeLong(this.f110355p);
        parcel.writeByte(this.f110356q ? (byte) 1 : 0);
        parcel.writeByte(this.f110357r ? (byte) 1 : 0);
        parcel.writeValue(this.f110358s);
        parcel.writeValue(this.f110352m);
        C42586u uVar = this.f110346g;
        Bundle bundle = new Bundle();
        for (Map.Entry entry : uVar.entrySet()) {
            bundle.putParcelable((String) entry.getKey(), (Parcelable) entry.getValue());
        }
        parcel.writeBundle(bundle);
        parcel.writeSerializable(this.f110348i);
    }
}
