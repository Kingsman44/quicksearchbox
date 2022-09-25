package com.google.android.sidekick.shared.renderingcontext;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.sidekick.shared.remoteapi.CardRenderingContext;
import com.google.android.sidekick.shared.remoteapi.RenderingContextParcelable;
import com.google.p375ai.p378b.C7651ex;
import com.google.p375ai.p378b.C8080uu;
import com.google.p375ai.p378b.C8169yb;
import java.util.Locale;
import java.util.Map;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
public class NavigationContext extends RenderingContextParcelable {
    public static final Parcelable.Creator CREATOR = new C45334b();

    /* renamed from: a */
    public static final String f118465a = "com.google.android.sidekick.shared.renderingcontext.NavigationContext";

    /* renamed from: b */
    public final Map f118466b = new ConcurrentHashMap(2);

    /* renamed from: c */
    public final int f118467c;

    public NavigationContext(Parcel parcel) {
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            C7651ex a = C7651ex.m22796a(parcel.readInt());
            C8169yb a2 = C8169yb.m22959a(parcel.readInt());
            if (!(a == null || a2 == null)) {
                this.f118466b.put(a, a2);
            }
        }
        this.f118467c = C8080uu.m22933a(parcel.readInt());
    }

    /* renamed from: a */
    public static NavigationContext m80830a(CardRenderingContext cardRenderingContext) {
        RenderingContextParcelable renderingContextParcelable = null;
        if (cardRenderingContext == null) {
            return null;
        }
        String str = f118465a;
        ClassLoader classLoader = NavigationContext.class.getClassLoader();
        synchronized (cardRenderingContext.f118456b) {
            Bundle bundle = cardRenderingContext.f118457c.getBundle("SPECIFIC_RENDERING_CONTEXT_CONTAINER_KEY");
            Class<NavigationContext> cls = NavigationContext.class;
            if (bundle == null) {
                cardRenderingContext.f118457c.setClassLoader(classLoader);
                renderingContextParcelable = cls.cast(cardRenderingContext.f118457c.getParcelable(str));
            } else {
                Bundle bundle2 = bundle.getBundle(str);
                if (bundle2 != null) {
                    bundle2.setClassLoader(classLoader);
                    renderingContextParcelable = cls.cast(bundle2.getParcelable("VALUE_KEY"));
                }
            }
        }
        return (NavigationContext) renderingContextParcelable;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f118466b.size());
        for (Map.Entry entry : this.f118466b.entrySet()) {
            parcel.writeInt(((C7651ex) entry.getKey()).f26563c);
            parcel.writeInt(((C8169yb) entry.getValue()).f28708e);
        }
        int i2 = this.f118467c;
        int i3 = i2 - 1;
        if (i2 != 0) {
            parcel.writeInt(i3);
            return;
        }
        throw null;
    }

    public NavigationContext(int i) {
        int i2 = 2;
        int i3 = i - 1;
        if (i3 == 1 || i3 == 2) {
            this.f118467c = i;
            return;
        }
        Locale locale = Locale.getDefault();
        if (!Locale.UK.equals(locale) && !Locale.US.equals(locale)) {
            i2 = 3;
        }
        this.f118467c = i2;
    }
}
