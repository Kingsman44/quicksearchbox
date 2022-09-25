package com.google.android.apps.gsa.shared.util.keepalive;

import android.app.Notification;
import android.app.NotificationManager;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90071dw;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.shared.util.keepalive.a */
/* compiled from: PG */
public final class C91049a {

    /* renamed from: a */
    public final NotificationManager f254309a;

    /* renamed from: b */
    public final SparseArray f254310b = new SparseArray();

    /* renamed from: c */
    public final SparseBooleanArray f254311c = new SparseBooleanArray();

    /* renamed from: d */
    public Integer f254312d;

    /* renamed from: e */
    private final C91051c f254313e;

    /* renamed from: f */
    private final C68214a f254314f;

    public C91049a(C91051c cVar, NotificationManager notificationManager, C68214a aVar) {
        this.f254313e = cVar;
        this.f254309a = notificationManager;
        this.f254314f = aVar;
    }

    /* renamed from: a */
    public final void mo85330a(boolean z) {
        Integer num = this.f254312d;
        num.getClass();
        int intValue = num.intValue();
        Notification notification = (Notification) this.f254310b.get(intValue);
        this.f254311c.delete(intValue);
        if (this.f254311c.size() != 0) {
            Integer valueOf = Integer.valueOf(this.f254311c.keyAt(0));
            this.f254312d = valueOf;
            mo85331b(valueOf.intValue(), (Notification) this.f254310b.get(this.f254312d.intValue()), true, true);
            if (!z) {
                mo85331b(intValue, notification, false, false);
                return;
            }
        } else if (z) {
            this.f254312d = null;
            this.f254313e.mo85321b(true);
        } else if (((C90021c) this.f254314f.mo27525b()).mo79746e(C90071dw.f249764i)) {
            this.f254313e.mo85321b(true);
            mo85331b(intValue, notification, false, false);
            this.f254312d = null;
            return;
        } else {
            this.f254313e.mo85321b(false);
            return;
        }
        this.f254310b.delete(intValue);
    }

    /* renamed from: b */
    public final void mo85331b(int i, Notification notification, boolean z, boolean z2) {
        this.f254310b.put(i, notification);
        if (z) {
            this.f254311c.put(i, true);
        } else {
            this.f254311c.delete(i);
        }
        if (z2) {
            this.f254312d = Integer.valueOf(i);
        }
        if (!z || z2) {
            notification.flags &= -3;
        } else {
            notification.flags |= 2;
        }
        if (!z || !z2) {
            C90476a aVar = C91018d.f254254a;
            this.f254309a.notify(i, notification);
            return;
        }
        this.f254313e.mo85320a(i, notification);
    }

    /* renamed from: c */
    public final boolean mo85332c(int i) {
        Integer num = this.f254312d;
        return num != null && num.intValue() == i;
    }
}
