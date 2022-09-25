package com.google.android.gearhead.sdk.assistant;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public class ClientStateSnapshot extends AbstractBundleable {
    public static final Parcelable.Creator CREATOR = new C142655a(ClientStateSnapshot.class);

    /* renamed from: a */
    public long f387105a;

    /* renamed from: b */
    public List f387106b;

    /* renamed from: c */
    public GearheadStateSnapshot f387107c;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo117436a(Bundle bundle) {
        this.f387105a = bundle.getLong("CREATED_MILLIS");
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("RECENT_MESSAGES");
        if (parcelableArrayList != null) {
            this.f387106b = new ArrayList(parcelableArrayList.size());
            int size = parcelableArrayList.size();
            for (int i = 0; i < size; i++) {
                MessagingInfo messagingInfo = new MessagingInfo();
                messagingInfo.mo117436a((Bundle) parcelableArrayList.get(i));
                this.f387106b.add(messagingInfo);
            }
        }
        Bundle bundle2 = bundle.getBundle("GEARHEAD_STATE_SNAPSHOT");
        if (bundle2 != null) {
            GearheadStateSnapshot gearheadStateSnapshot = new GearheadStateSnapshot();
            this.f387107c = gearheadStateSnapshot;
            gearheadStateSnapshot.mo117436a(bundle2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo117437b(Bundle bundle) {
        bundle.putLong("CREATED_MILLIS", this.f387105a);
        List list = this.f387106b;
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            for (MessagingInfo b : this.f387106b) {
                Bundle bundle2 = new Bundle();
                b.mo117437b(bundle2);
                arrayList.add(bundle2);
            }
            bundle.putParcelableArrayList("RECENT_MESSAGES", arrayList);
        }
        if (this.f387107c != null) {
            Bundle bundle3 = new Bundle();
            this.f387107c.mo117437b(bundle3);
            bundle.putBundle("GEARHEAD_STATE_SNAPSHOT", bundle3);
        }
    }
}
