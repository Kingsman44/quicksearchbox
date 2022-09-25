package com.google.android.gms.feedback.p10795a.p10796a;

import android.os.Bundle;
import android.os.Parcel;
import android.util.Pair;
import com.google.android.gms.feedback.C144208m;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.p10795a.p10797b.C144194a;
import com.google.android.p10905k.C146607f;
import com.google.android.p10905k.C146608g;
import com.google.android.p10905k.C146609h;
import java.security.SecureRandom;
import java.util.List;

/* renamed from: com.google.android.gms.feedback.a.a.a */
/* compiled from: PG */
public final class C144191a {
    /* renamed from: a */
    public static Bundle m234429a(List list) {
        if (list == null) {
            return null;
        }
        int size = list.size();
        Bundle bundle = new Bundle(size);
        for (int i = 0; i < size; i++) {
            Pair pair = (Pair) list.get(i);
            bundle.putString((String) pair.first, (String) pair.second);
        }
        return bundle;
    }

    @Deprecated
    /* renamed from: b */
    public static String m234430b() {
        long currentTimeMillis = System.currentTimeMillis();
        long abs = Math.abs(new SecureRandom().nextLong());
        return currentTimeMillis + "-" + abs;
    }

    /* renamed from: c */
    public static void m234431c(Bundle bundle) {
        C146609h hVar = C144194a.f390603d;
        String str = hVar.f395980b;
        if (((C146607f) hVar).mo123402a().booleanValue() && bundle != null) {
            Parcel obtain = Parcel.obtain();
            obtain.writeBundle(bundle);
            int dataSize = obtain.dataSize();
            obtain.recycle();
            C146609h hVar2 = C144194a.f390602c;
            String str2 = hVar2.f395980b;
            if (dataSize > ((C146608g) hVar2).mo123403a().intValue()) {
                C146609h hVar3 = C144194a.f390602c;
                String str3 = hVar3.f395980b;
                String obj = ((C146608g) hVar3).mo123403a().toString();
                throw new IllegalStateException("Max allowed bundle size of " + obj + " exceeded, you are passing in a bundle of " + dataSize + " size.");
            }
        }
    }

    /* renamed from: d */
    public static void m234432d(FeedbackOptions feedbackOptions) {
        C146609h hVar = C144194a.f390603d;
        String str = hVar.f395980b;
        if (((C146607f) hVar).mo123402a().booleanValue() && feedbackOptions != null) {
            Parcel obtain = Parcel.obtain();
            C144208m.m234457a(feedbackOptions, obtain, 0);
            int dataSize = obtain.dataSize();
            obtain.recycle();
            C146609h hVar2 = C144194a.f390602c;
            String str2 = hVar2.f395980b;
            if (dataSize > ((C146608g) hVar2).mo123403a().intValue()) {
                C146609h hVar3 = C144194a.f390602c;
                String str3 = hVar3.f395980b;
                String obj = ((C146608g) hVar3).mo123403a().toString();
                throw new IllegalStateException("Max allowed feedback options size of " + obj + " exceeded, you are passing in feedback options of " + dataSize + " size.");
            }
        }
    }

    /* renamed from: e */
    public static void m234433e(Runnable runnable) {
        Thread thread = new Thread(runnable, "Feedback");
        thread.setPriority(4);
        thread.start();
    }
}
