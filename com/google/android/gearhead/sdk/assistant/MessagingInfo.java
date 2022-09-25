package com.google.android.gearhead.sdk.assistant;

import android.app.PendingIntent;
import android.app.RemoteInput;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.os.Parcelable;
import android.service.notification.StatusBarNotification;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
public class MessagingInfo extends AbstractBundleable {
    public static final Parcelable.Creator CREATOR = new C142655a(MessagingInfo.class);
    @Deprecated

    /* renamed from: a */
    public StatusBarNotification f387115a;
    @Deprecated

    /* renamed from: b */
    public List f387116b;
    @Deprecated

    /* renamed from: c */
    public String f387117c;

    /* renamed from: d */
    public long f387118d;

    /* renamed from: e */
    public List f387119e = new ArrayList();

    /* renamed from: f */
    public String f387120f;

    /* renamed from: g */
    public PendingIntent f387121g;

    /* renamed from: h */
    public PendingIntent f387122h;

    /* renamed from: i */
    public RemoteInput f387123i;

    /* renamed from: j */
    public String f387124j;

    /* renamed from: k */
    public Icon f387125k;

    /* renamed from: l */
    public boolean f387126l;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo117436a(Bundle bundle) {
        List list;
        this.f387115a = (StatusBarNotification) bundle.getParcelable("NOTIFICATION");
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("SMS_PDUS");
        int i = 0;
        if (parcelableArrayList != null) {
            this.f387116b = new ArrayList(parcelableArrayList.size());
            int size = parcelableArrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f387116b.add(((Bundle) parcelableArrayList.get(i2)).getByteArray("SMS_PDU"));
            }
        }
        this.f387117c = bundle.getString("SENDER_DISPLAY_NAME");
        this.f387118d = bundle.getLong("LAST_READ_MILLIS");
        this.f387121g = (PendingIntent) bundle.getParcelable("READ_PENDING_INTENT");
        Bundle bundle2 = bundle.getBundle("MESSAGES_LIST_BUNDLE");
        if (bundle2 != null) {
            ArrayList arrayList = new ArrayList();
            while (true) {
                if (i >= bundle2.size()) {
                    list = arrayList;
                    break;
                }
                Bundle bundle3 = bundle2.getBundle(Integer.toString(i));
                C142665k kVar = null;
                if (bundle3 != null) {
                    String string = bundle3.getString("sender");
                    String string2 = bundle3.getString("sender_id", (String) null);
                    String string3 = bundle3.getString("body");
                    Long valueOf = Long.valueOf(bundle3.getLong("timestamp"));
                    if (!(string == null || string3 == null || valueOf.longValue() == 0)) {
                        kVar = new C142665k(string, string2 == null ? string : string2, string3, valueOf.longValue());
                    }
                }
                if (kVar == null) {
                    list = Collections.emptyList();
                    break;
                } else {
                    arrayList.add(kVar);
                    i++;
                }
            }
        } else {
            list = Collections.emptyList();
        }
        this.f387119e = list;
        this.f387120f = bundle.getString("CONVERSATION_TITLE");
        this.f387124j = bundle.getString("PACKAGE_NAME");
        this.f387125k = (Icon) bundle.getParcelable("ICON");
        this.f387122h = (PendingIntent) bundle.getParcelable("REPLY_PENDING_INTENT");
        this.f387123i = (RemoteInput) bundle.getParcelable("REMOTE_INPUT");
        this.f387126l = bundle.getBoolean("IS_GROUP_CONVERSATION");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo117437b(Bundle bundle) {
        bundle.putParcelable("NOTIFICATION", this.f387115a);
        List list = this.f387116b;
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            for (byte[] putByteArray : this.f387116b) {
                Bundle bundle2 = new Bundle();
                bundle2.putByteArray("SMS_PDU", putByteArray);
                arrayList.add(bundle2);
            }
            bundle.putParcelableArrayList("SMS_PDUS", arrayList);
        }
        bundle.putString("SENDER_DISPLAY_NAME", this.f387117c);
        bundle.putLong("LAST_READ_MILLIS", this.f387118d);
        bundle.putParcelable("READ_PENDING_INTENT", this.f387121g);
        List list2 = this.f387119e;
        Bundle bundle3 = new Bundle();
        for (int i = 0; i < list2.size(); i++) {
            String num = Integer.toString(i);
            C142665k kVar = (C142665k) list2.get(i);
            Bundle bundle4 = new Bundle();
            bundle4.putString("sender", kVar.f387146a);
            bundle4.putString("sender_id", kVar.f387147b);
            bundle4.putString("body", kVar.f387148c);
            bundle4.putLong("timestamp", kVar.f387149d);
            bundle3.putBundle(num, bundle4);
        }
        bundle.putBundle("MESSAGES_LIST_BUNDLE", bundle3);
        bundle.putString("CONVERSATION_TITLE", this.f387120f);
        bundle.putString("PACKAGE_NAME", this.f387124j);
        bundle.putParcelable("ICON", this.f387125k);
        bundle.putParcelable("REPLY_PENDING_INTENT", this.f387122h);
        bundle.putParcelable("REMOTE_INPUT", this.f387123i);
        bundle.putBoolean("IS_GROUP_CONVERSATION", this.f387126l);
    }

    public final String toString() {
        long j = this.f387118d;
        int size = this.f387119e.size();
        String str = this.f387124j;
        return "MessagingInfo: { lastReadMillis: " + j + ", Messages: " + size + ", Originating package: " + str + " }";
    }
}
