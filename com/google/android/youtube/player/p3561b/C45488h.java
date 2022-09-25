package com.google.android.youtube.player.p3561b;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* renamed from: com.google.android.youtube.player.b.h */
public final class C45488h extends C45446ae implements C45465ax {

    /* renamed from: h */
    private final String f118909h;

    /* renamed from: i */
    private final String f118910i;

    /* renamed from: j */
    private final String f118911j;

    /* renamed from: k */
    private boolean f118912k;

    public C45488h(Context context, String str, String str2, String str3, C45481bm bmVar, C45482bn bnVar) {
        super(context, bmVar, bnVar);
        this.f118909h = str;
        C45459ar.m81135b(str2, "App package name cannot be null or empty");
        this.f118910i = str2;
        C45459ar.m81135b(str3, "App versionName cannot be null or empty");
        this.f118911j = str3;
    }

    /* renamed from: n */
    private final void m81226n() {
        mo49600j();
        if (this.f118912k) {
            throw new IllegalStateException("Connection client has been released");
        }
    }

    /* renamed from: a */
    public final IBinder mo49612a() {
        m81226n();
        try {
            mo49600j();
            C45480bl blVar = (C45480bl) this.f118856b;
            Parcel ls = blVar.mo49587ls(4, blVar.mo49586lr());
            IBinder readStrongBinder = ls.readStrongBinder();
            ls.recycle();
            return readStrongBinder;
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: b */
    public final IBinder mo49613b() {
        m81226n();
        try {
            mo49600j();
            C45480bl blVar = (C45480bl) this.f118856b;
            Parcel ls = blVar.mo49587ls(1, blVar.mo49586lr());
            IBinder readStrongBinder = ls.readStrongBinder();
            ls.recycle();
            return readStrongBinder;
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ IInterface mo49593c(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.youtube.player.internal.IYouTubeService");
        return queryLocalInterface instanceof C45480bl ? (C45480bl) queryLocalInterface : new C45480bl(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo49594d() {
        return "com.google.android.youtube.player.internal.IYouTubeService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final String mo49595e() {
        return "com.google.android.youtube.api.service.START";
    }

    /* renamed from: f */
    public final void mo49596f() {
        int i;
        FrameLayout frameLayout;
        if (!this.f118912k && mo49602l()) {
            try {
                mo49600j();
                C45480bl blVar = (C45480bl) this.f118856b;
                Parcel lr = blVar.mo49586lr();
                C45460as.m81138b(lr, true);
                blVar.mo49588lt(3, lr);
            } catch (RemoteException unused) {
            }
            this.f118912k = true;
        }
        super.mo49598h();
        this.f118855a.removeMessages(4);
        synchronized (this.f118857c) {
            this.f118859e = true;
            ArrayList arrayList = this.f118857c;
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                } else if (!this.f118861g) {
                    break;
                } else {
                    if (this.f118857c.contains(arrayList.get(i2))) {
                        C45481bm bmVar = (C45481bm) arrayList.get(i2);
                        C45485e eVar = bmVar.f118885a;
                        View view = eVar.f118900l;
                        if (!(view == null || (frameLayout = eVar.f118898j) == null)) {
                            frameLayout.removeView(view);
                            C45485e eVar2 = bmVar.f118885a;
                            eVar2.f118898j.addView(eVar2.f118897i);
                            bmVar.f118885a.f118894f.mo44074n(C45447af.m81104a(8));
                        }
                        C45485e eVar3 = bmVar.f118885a;
                        eVar3.f118900l = null;
                        C45475bg bgVar = eVar3.f118904p;
                        if (bgVar != null) {
                            try {
                                bgVar.mo49588lt(3, bgVar.mo49586lr());
                            } catch (RemoteException e) {
                                C45457ap.m81128a(e.getMessage(), new Object[0]);
                            }
                        }
                        bmVar.f118885a.f118896h.mo49671k((C45475bg) null);
                        C45485e eVar4 = bmVar.f118885a;
                        eVar4.f118904p = null;
                        eVar4.f118901m = C45465ax.f118878l;
                        eVar4.f118891c = C45485e.f118889a;
                    }
                    i2++;
                }
            }
            this.f118859e = false;
        }
        this.f118861g = false;
        synchronized (this.f118860f) {
            int size2 = this.f118860f.size();
            for (i = 0; i < size2; i++) {
                C45442aa aaVar = (C45442aa) this.f118860f.get(i);
                synchronized (aaVar) {
                    aaVar.f118849a = null;
                }
            }
            this.f118860f.clear();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo49597g(C45479bk bkVar, C45444ac acVar) {
        String str = this.f118910i;
        String str2 = this.f118911j;
        String str3 = this.f118909h;
        Parcel lr = bkVar.mo49586lr();
        C45460as.m81140d(lr, acVar);
        lr.writeInt(11301);
        lr.writeString(str);
        lr.writeString(str2);
        lr.writeString(str3);
        C45460as.m81139c(lr, (Parcelable) null);
        bkVar.mo49588lt(1, lr);
    }
}
