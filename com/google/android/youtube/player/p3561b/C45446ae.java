package com.google.android.youtube.player.p3561b;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Log;
import com.google.android.youtube.player.C45440b;
import com.google.android.youtube.player.C45510f;
import java.util.ArrayList;

/* renamed from: com.google.android.youtube.player.b.ae */
public abstract class C45446ae implements C45449ah {

    /* renamed from: a */
    final Handler f118855a;

    /* renamed from: b */
    public IInterface f118856b;

    /* renamed from: c */
    public ArrayList f118857c;

    /* renamed from: d */
    public final ArrayList f118858d = new ArrayList();

    /* renamed from: e */
    public boolean f118859e = false;

    /* renamed from: f */
    public final ArrayList f118860f = new ArrayList();

    /* renamed from: g */
    public boolean f118861g = false;

    /* renamed from: h */
    private final Context f118862h;

    /* renamed from: i */
    private ArrayList f118863i;

    /* renamed from: j */
    private ServiceConnection f118864j;

    protected C45446ae(Context context, C45481bm bmVar, C45482bn bnVar) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            this.f118862h = context;
            ArrayList arrayList = new ArrayList();
            this.f118857c = arrayList;
            C45459ar.m81136c(bmVar);
            arrayList.add(bmVar);
            ArrayList arrayList2 = new ArrayList();
            this.f118863i = arrayList2;
            C45459ar.m81136c(bnVar);
            arrayList2.add(bnVar);
            this.f118855a = new C45505y(this);
            return;
        }
        throw new IllegalStateException("Clients must be created on the UI thread.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract IInterface mo49593c(IBinder iBinder);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract String mo49594d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract String mo49595e();

    /* renamed from: f */
    public void mo49596f() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract void mo49597g(C45479bk bkVar, C45444ac acVar);

    /* renamed from: h */
    public final void mo49598h() {
        ServiceConnection serviceConnection = this.f118864j;
        if (serviceConnection != null) {
            try {
                this.f118862h.unbindService(serviceConnection);
            } catch (IllegalArgumentException e) {
                Log.w("YouTubeClient", "Unexpected error from unbindService()", e);
            }
        }
        this.f118856b = null;
        this.f118864j = null;
    }

    /* renamed from: i */
    public final void mo49599i() {
        this.f118861g = true;
        C45510f a = C45440b.m81085a(this.f118862h);
        if (a != C45510f.SUCCESS) {
            Handler handler = this.f118855a;
            handler.sendMessage(handler.obtainMessage(3, a));
            return;
        }
        Intent intent = new Intent(mo49595e()).setPackage(C45458aq.m81132c(this.f118862h));
        if (this.f118864j != null) {
            Log.e("YouTubeClient", "Calling connect() while still connected, missing disconnect().");
            mo49598h();
        }
        C45445ad adVar = new C45445ad(this);
        this.f118864j = adVar;
        if (!this.f118862h.bindService(intent, adVar, 129)) {
            Handler handler2 = this.f118855a;
            handler2.sendMessage(handler2.obtainMessage(3, C45510f.ERROR_CONNECTING_TO_SERVICE));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo49600j() {
        if (!mo49602l()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo49601k(C45510f fVar) {
        this.f118855a.removeMessages(4);
        mo49598h();
        synchronized (this.f118863i) {
            ArrayList arrayList = this.f118863i;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                if (this.f118861g) {
                    if (this.f118863i.contains(arrayList.get(i))) {
                        C45485e eVar = ((C45482bn) arrayList.get(i)).f118886a;
                        eVar.f118901m = C45465ax.f118878l;
                        C45485e.m81199s(eVar, fVar);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: l */
    public final boolean mo49602l() {
        return this.f118856b != null;
    }

    /* renamed from: m */
    public final boolean mo49603m() {
        return this.f118864j != null && this.f118856b == null;
    }
}
