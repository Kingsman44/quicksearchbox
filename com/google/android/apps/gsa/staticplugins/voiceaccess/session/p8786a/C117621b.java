package com.google.android.apps.gsa.staticplugins.voiceaccess.session.p8786a;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.staticplugins.voiceaccess.session.p8790e.C117674e;
import com.google.android.libraries.accessibility.voiceaccess.api.C147334a;
import com.google.android.libraries.accessibility.voiceaccess.api.C147345c;
import com.google.android.libraries.accessibility.voiceaccess.api.C147346d;
import com.google.android.p445a.C8850c;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.voiceaccess.session.a.b */
/* compiled from: PG */
final class C117621b implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ C117623d f326503a;

    public C117621b(C117623d dVar) {
        this.f326503a = dVar;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C147334a aVar;
        C58976aa aaVar = C58975e.f156826a;
        C147346d dVar = null;
        if (iBinder == null) {
            aVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.libraries.accessibility.voiceaccess.api.IVoiceAccessBinder");
            aVar = queryLocalInterface instanceof C147334a ? (C147334a) queryLocalInterface : new C147334a(iBinder);
        }
        C117623d dVar2 = this.f326503a;
        try {
            C147345c cVar = dVar2.f326506c;
            Parcel gA = aVar.mo17260gA();
            C8850c.m23499h(gA, cVar);
            Parcel gT = aVar.mo17261gT(1, gA);
            IBinder readStrongBinder = gT.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface2 = readStrongBinder.queryLocalInterface("com.google.android.libraries.accessibility.voiceaccess.api.IVoiceAccessClientConnection");
                dVar = queryLocalInterface2 instanceof C147346d ? (C147346d) queryLocalInterface2 : new C147346d(readStrongBinder);
            }
            gT.recycle();
            dVar2.f326508e = dVar;
        } catch (RemoteException e) {
            C59104x d = C117623d.f326504a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "VoiceAccessServiceConn");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(33588)).mo56386p("RemoteException when trying to attach client.");
            int i = C90755l.f253831a;
        }
        C117623d dVar3 = this.f326503a;
        if (dVar3.f326507d) {
            dVar3.mo103415d();
        } else {
            dVar3.mo103413b();
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C58976aa aaVar = C58975e.f156826a;
        C117623d dVar = this.f326503a;
        dVar.f326508e = null;
        dVar.f326507d = false;
        C117622c cVar = dVar.f326505b;
        if (cVar != null) {
            ((C117674e) cVar).mo103427d();
        }
    }
}
