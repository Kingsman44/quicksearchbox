package com.google.android.apps.gsa.shared.notificationlistening.common;

import android.app.PendingIntent;
import android.app.RemoteInput;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.service.notification.StatusBarNotification;
import android.telephony.SmsMessage;
import androidx.core.app.C1809az;
import androidx.core.app.C1811ba;
import androidx.core.app.C1831r;
import androidx.core.app.C1832s;
import com.evernote.android.state.BuildConfig;
import com.google.android.gearhead.sdk.assistant.C142665k;
import com.google.android.gearhead.sdk.assistant.MessagingInfo;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58485gu;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p3186j$.util.Objects;

/* compiled from: PG */
public class NotificationWrapper implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C90430k();

    /* renamed from: a */
    public final StatusBarNotification f252550a;

    /* renamed from: b */
    public final List f252551b;

    /* renamed from: c */
    public final String f252552c;

    /* renamed from: d */
    public final String f252553d;

    /* renamed from: e */
    public final boolean f252554e;

    /* renamed from: f */
    public final String f252555f;

    /* renamed from: g */
    public long f252556g = -1;

    /* renamed from: h */
    private final PendingIntent f252557h;

    /* renamed from: i */
    private final PendingIntent f252558i;

    /* renamed from: j */
    private final RemoteInput f252559j;

    public NotificationWrapper(Parcel parcel) {
        C58485gu guVar;
        Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
        this.f252550a = (StatusBarNotification) readBundle.getParcelable("NOTIFICATION");
        Bundle bundle = (Bundle) readBundle.getParcelable("MESSAGES_BUNDLE");
        if (bundle != null) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (true) {
                if (i >= bundle.size()) {
                    guVar = C58485gu.m89842j(arrayList);
                    break;
                }
                Bundle bundle2 = bundle.getBundle(Integer.toString(i));
                C90431l lVar = null;
                if (bundle2 != null) {
                    String string = bundle2.getString("sender");
                    String string2 = bundle2.getString("body");
                    long j = bundle2.getLong("timestamp");
                    String string3 = bundle2.getString("mimetype");
                    Uri uri = (Uri) bundle2.getParcelable("data_uri");
                    String string4 = bundle2.getString("data_file_dest");
                    long j2 = bundle2.getLong("content_creation_time");
                    if (!(string == null || string2 == null)) {
                        lVar = new C90431l(string, string2, j, string3, uri, string4, j2);
                    }
                }
                if (lVar == null) {
                    guVar = C58485gu.m89845m();
                    break;
                } else {
                    arrayList.add(lVar);
                    i++;
                }
            }
        } else {
            guVar = C58485gu.m89845m();
        }
        this.f252551b = guVar;
        this.f252552c = readBundle.getString("PACKAGE_NAME", BuildConfig.FLAVOR);
        this.f252553d = readBundle.getString("UNIQUE_ID", BuildConfig.FLAVOR);
        this.f252557h = (PendingIntent) readBundle.getParcelable("READ_PENDING_INTENT");
        this.f252558i = (PendingIntent) readBundle.getParcelable("REPLY_PENDING_INTENT");
        this.f252559j = (RemoteInput) readBundle.getParcelable("REMOTE_INPUT");
        this.f252554e = readBundle.getBoolean("SHOULD_OVERRIDE_ACTIONS");
        this.f252555f = readBundle.getString("GROUP_NAME");
    }

    /* renamed from: a */
    public final C1832s mo84138a() {
        PendingIntent pendingIntent = this.f252557h;
        if (pendingIntent == null) {
            return null;
        }
        C1831r rVar = new C1831r(0, "Reply", pendingIntent);
        rVar.f5646a = 2;
        return rVar.mo5008a();
    }

    /* renamed from: b */
    public final C1832s mo84139b() {
        RemoteInput remoteInput;
        if (this.f252558i == null || (remoteInput = this.f252559j) == null) {
            return null;
        }
        String resultKey = remoteInput.getResultKey();
        HashSet hashSet = new HashSet();
        Bundle bundle = new Bundle();
        if (resultKey != null) {
            C1811ba a = C1809az.m4976a(resultKey, hashSet, bundle, (CharSequence) null, (CharSequence[]) null, true);
            C1831r rVar = new C1831r(0, "Reply", this.f252558i);
            rVar.f5646a = 1;
            rVar.mo5009b(a);
            return rVar.mo5008a();
        }
        throw new IllegalArgumentException("Result key can't be null");
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("NOTIFICATION", this.f252550a);
        List list = this.f252551b;
        Bundle bundle2 = new Bundle();
        if (list != null) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                String num = Integer.toString(i2);
                C90431l lVar = (C90431l) list.get(i2);
                Bundle bundle3 = new Bundle();
                bundle3.putString("sender", lVar.f252630a);
                bundle3.putString("body", lVar.f252631b);
                bundle3.putLong("timestamp", lVar.f252632c);
                bundle3.putString("mimetype", lVar.f252633d);
                bundle3.putParcelable("data_uri", lVar.f252634e);
                bundle3.putString("data_file_dest", lVar.f252635f);
                bundle3.putLong("content_creation_time", lVar.f252636g);
                bundle2.putBundle(num, bundle3);
            }
        }
        bundle.putParcelable("MESSAGES_BUNDLE", bundle2);
        bundle.putString("PACKAGE_NAME", this.f252552c);
        bundle.putString("UNIQUE_ID", this.f252553d);
        bundle.putParcelable("READ_PENDING_INTENT", this.f252557h);
        bundle.putParcelable("REPLY_PENDING_INTENT", this.f252558i);
        bundle.putParcelable("REMOTE_INPUT", this.f252559j);
        bundle.putBoolean("SHOULD_OVERRIDE_ACTIONS", this.f252554e);
        bundle.putString("GROUP_NAME", this.f252555f);
        parcel.writeBundle(bundle);
    }

    public NotificationWrapper(StatusBarNotification statusBarNotification) {
        this.f252550a = statusBarNotification;
        this.f252551b = new ArrayList();
        this.f252552c = statusBarNotification.getPackageName();
        this.f252553d = statusBarNotification.getKey();
        this.f252557h = null;
        this.f252558i = null;
        this.f252559j = null;
        this.f252554e = false;
        this.f252555f = null;
    }

    public NotificationWrapper(BundledMessageNotification bundledMessageNotification) {
        NotificationWrapper notificationWrapper = this;
        notificationWrapper.f252553d = C58837ba.m90858g(bundledMessageNotification.mo84119i());
        bundledMessageNotification.mo84112c();
        bundledMessageNotification.mo84124n();
        String str = null;
        notificationWrapper.f252550a = null;
        notificationWrapper.f252557h = null;
        notificationWrapper.f252558i = null;
        notificationWrapper.f252559j = null;
        int i = 0;
        notificationWrapper.f252554e = false;
        notificationWrapper.f252555f = bundledMessageNotification.mo84123m() ? ((CharSequence) Objects.requireNonNull(bundledMessageNotification.mo84115e())).toString() : str;
        notificationWrapper.f252551b = new ArrayList();
        notificationWrapper.f252552c = bundledMessageNotification.mo84120j();
        C58485gu d = bundledMessageNotification.mo84113d();
        int size = d.size();
        while (i < size) {
            MessageNotification messageNotification = (MessageNotification) d.get(i);
            CharSequence charSequence = messageNotification.f252543t;
            String obj = charSequence != null ? charSequence.toString() : BuildConfig.FLAVOR;
            List list = notificationWrapper.f252551b;
            String obj2 = messageNotification.f252535E.toString();
            long j = messageNotification.f252592m;
            String str2 = messageNotification.f252545v;
            Uri uri = messageNotification.f252546w;
            String str3 = messageNotification.f252547x;
            long j2 = messageNotification.f252593n;
            C90431l lVar = r6;
            C90431l lVar2 = new C90431l(obj2, obj, j, str2, uri, str3, j2);
            list.add(lVar);
            i++;
            notificationWrapper = this;
            d = d;
        }
    }

    public NotificationWrapper(MessagingInfo messagingInfo, boolean z) {
        String str;
        String str2 = null;
        StatusBarNotification statusBarNotification = z ? messagingInfo.f387115a : null;
        this.f252550a = statusBarNotification;
        if (statusBarNotification != null) {
            str = statusBarNotification.getKey();
        } else {
            str = String.format("key-%s", new Object[]{Integer.toHexString(messagingInfo.hashCode())});
        }
        this.f252553d = str;
        this.f252557h = messagingInfo.f387121g;
        this.f252558i = messagingInfo.f387122h;
        this.f252559j = messagingInfo.f387123i;
        this.f252554e = true;
        this.f252555f = messagingInfo.f387126l ? messagingInfo.f387120f : str2;
        this.f252551b = new ArrayList();
        List<byte[]> list = messagingInfo.f387116b;
        if (list == null) {
            this.f252552c = messagingInfo.f387124j;
            for (C142665k kVar : messagingInfo.f387119e) {
                long j = kVar.f387149d;
                if (j > 10000000000000L) {
                    j /= 1000;
                }
                this.f252551b.add(new C90431l(kVar.f387146a, kVar.f387148c, j, (String) null, (Uri) null, (String) null, -1));
            }
            return;
        }
        this.f252552c = "sms";
        for (byte[] createFromPdu : list) {
            SmsMessage createFromPdu2 = SmsMessage.createFromPdu(createFromPdu);
            if (createFromPdu2 != null) {
                this.f252551b.add(new C90431l(messagingInfo.f387117c, createFromPdu2.getMessageBody(), createFromPdu2.getTimestampMillis(), (String) null, (Uri) null, (String) null, -1));
            }
        }
    }
}
