package com.google.android.apps.gsa.shared.notificationlistening.common;

import android.app.Notification;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.C1832s;
import com.evernote.android.state.BuildConfig;
import com.google.common.p4522b.C58485gu;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public class BundledMessageNotification implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C90422c();

    /* renamed from: a */
    private final List f252528a;

    protected BundledMessageNotification(Parcel parcel) {
        ArrayList createTypedArrayList = parcel.createTypedArrayList(MessageNotification.CREATOR);
        this.f252528a = createTypedArrayList == null ? new ArrayList() : createTypedArrayList;
    }

    public BundledMessageNotification(C90423d dVar) {
        this.f252528a = dVar.f252598a;
    }

    /* renamed from: a */
    public final long mo84110a() {
        MessageNotification c = mo84112c();
        if (c == null) {
            return 0;
        }
        return c.f252592m;
    }

    /* renamed from: b */
    public final Notification mo84111b() {
        Notification notification;
        MessageNotification c = mo84112c();
        if (c == null || (notification = c.f252534D) == null) {
            return new Notification();
        }
        return notification;
    }

    /* renamed from: c */
    public final MessageNotification mo84112c() {
        List list = this.f252528a;
        if (list == null || list.isEmpty()) {
            return null;
        }
        List list2 = this.f252528a;
        return (MessageNotification) list2.get(list2.size() - 1);
    }

    /* renamed from: d */
    public final C58485gu mo84113d() {
        List list = this.f252528a;
        return list == null ? C58485gu.m89845m() : C58485gu.m89842j(list);
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final CharSequence mo84115e() {
        MessageNotification c = mo84112c();
        if (c == null) {
            return null;
        }
        return c.f252541r;
    }

    /* renamed from: f */
    public final CharSequence mo84116f() {
        MessageNotification c = mo84112c();
        return c == null ? BuildConfig.FLAVOR : c.f252535E;
    }

    /* renamed from: g */
    public final String mo84117g() {
        MessageNotification c = mo84112c();
        return c == null ? BuildConfig.FLAVOR : c.f252581b;
    }

    /* renamed from: h */
    public final String mo84118h() {
        CharSequence charSequence;
        if (this.f252528a == null) {
            return BuildConfig.FLAVOR;
        }
        StringBuilder sb = new StringBuilder();
        for (MessageNotification messageNotification : this.f252528a) {
            if (!(messageNotification == null || (charSequence = messageNotification.f252543t) == null)) {
                sb.append(charSequence);
                sb.append(". ");
            }
        }
        return sb.toString();
    }

    /* renamed from: i */
    public final String mo84119i() {
        MessageNotification c = mo84112c();
        if (c == null) {
            return null;
        }
        return c.mo84145c();
    }

    /* renamed from: j */
    public final String mo84120j() {
        MessageNotification c = mo84112c();
        return c == null ? BuildConfig.FLAVOR : c.f252591l;
    }

    /* renamed from: k */
    public final void mo84121k(C1832s sVar) {
        List<MessageNotification> list = this.f252528a;
        if (list != null) {
            for (MessageNotification messageNotification : list) {
                messageNotification.f252531A = sVar;
                messageNotification.f252532B = sVar != null;
            }
        }
    }

    /* renamed from: l */
    public final void mo84122l(C1832s sVar) {
        List<MessageNotification> list = this.f252528a;
        if (list != null) {
            for (MessageNotification messageNotification : list) {
                messageNotification.f252548y = sVar;
                messageNotification.f252549z = sVar != null;
            }
        }
    }

    /* renamed from: m */
    public final boolean mo84123m() {
        MessageNotification c = mo84112c();
        if (c == null) {
            return false;
        }
        return c.mo84134g();
    }

    /* renamed from: n */
    public final boolean mo84124n() {
        MessageNotification c = mo84112c();
        if (c == null) {
            return false;
        }
        return c.f252549z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f252528a);
    }
}
