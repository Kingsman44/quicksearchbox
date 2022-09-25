package com.google.android.libraries.web.weblayer.p3464f.p3467b;

import android.os.RemoteException;
import com.google.android.libraries.web.profile.Profile;
import org.chromium.p5643b.p5644a.C72304a;
import org.chromium.weblayer.C72587aw;
import org.chromium.weblayer.C72604bm;
import org.chromium.weblayer.C72611bt;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.weblayer.f.b.u */
/* compiled from: PG */
public final class C44268u {
    /* renamed from: a */
    public static final C72587aw m78127a(C72611bt btVar, Profile profile) {
        C69664n.m101061g(btVar, "<this>");
        C69664n.m101061g(profile, "profile");
        if (profile.f114485c) {
            String str = profile.f114483a;
            C72604bm.m107399a();
            try {
                return C72587aw.m107321d(btVar.f193174f.mo63790w(C72611bt.m107416d(str)));
            } catch (RemoteException e) {
                throw new C72304a(e);
            }
        } else {
            String str2 = profile.f114483a;
            C72604bm.m107399a();
            try {
                return C72587aw.m107321d(btVar.f193174f.mo63791x(C72611bt.m107416d(str2)));
            } catch (RemoteException e2) {
                throw new C72304a(e2);
            }
        }
    }
}
