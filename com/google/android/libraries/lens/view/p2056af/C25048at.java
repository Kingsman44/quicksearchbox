package com.google.android.libraries.lens.view.p2056af;

import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.libraries.p1635au.C19569f;

/* renamed from: com.google.android.libraries.lens.view.af.at */
/* compiled from: PG */
public final class C25048at {

    /* renamed from: a */
    private final C25070bo f68277a;

    /* renamed from: b */
    private final C25043ao f68278b;

    /* renamed from: c */
    private final boolean f68279c;

    public C25048at(C25070bo boVar, C25043ao aoVar, boolean z) {
        this.f68277a = boVar;
        this.f68278b = aoVar;
        this.f68279c = z;
    }

    /* renamed from: a */
    public final void mo30240a(int i, int i2) {
        int i3 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i3 == 1) {
            this.f68277a.mo30251a(C118575h.LENS_CLOUD_COPY, C118569b.LENS_CLOUD_COPY_ZERO_STATE_RETRY_DEVICE_LIST_COUNT, (long) i2);
            if (this.f68279c) {
                ((C19569f) this.f68278b.f68251c.mo6453a()).mo24824b((double) i2, new Object[0]);
            }
        } else if (i3 == 2) {
            this.f68277a.mo30251a(C118575h.LENS_CLOUD_COPY, C118569b.LENS_CLOUD_COPY_AUTO_REFRESH_DEVICE_LIST_COUNT, (long) i2);
            if (this.f68279c) {
                ((C19569f) this.f68278b.f68250b.mo6453a()).mo24824b((double) i2, new Object[0]);
            }
        } else if (i3 == 3) {
            this.f68277a.mo30251a(C118575h.LENS_CLOUD_COPY, C118569b.LENS_CLOUD_COPY_TOOLBELT_CHIP_DEVICE_LIST_COUNT, (long) i2);
            if (this.f68279c) {
                ((C19569f) this.f68278b.f68252d.mo6453a()).mo24824b((double) i2, new Object[0]);
            }
        } else if (i3 == 4) {
            this.f68277a.mo30251a(C118575h.LENS_CLOUD_COPY, C118569b.LENS_CLOUD_COPY_REFRESH_BUTTON_DEVICE_LIST_COUNT, (long) i2);
            if (this.f68279c) {
                ((C19569f) this.f68278b.f68253e.mo6453a()).mo24824b((double) i2, new Object[0]);
            }
        }
    }
}
