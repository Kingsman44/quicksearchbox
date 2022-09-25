package com.google.android.apps.gsa.staticplugins.voiceaccess.session.p8786a;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.C0825a;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.libraries.accessibility.voiceaccess.api.C147345c;
import com.google.android.libraries.accessibility.voiceaccess.api.C147346d;
import com.google.android.libraries.accessibility.voiceaccess.api.VoiceAccessClientEventData;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.android.p445a.C8850c;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.voiceaccess.session.a.d */
/* compiled from: PG */
public final class C117623d implements C117624e {

    /* renamed from: a */
    public static final C59071e f326504a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.voiceaccess.session.a.d");

    /* renamed from: b */
    public C117622c f326505b;

    /* renamed from: c */
    public final C147345c f326506c;

    /* renamed from: d */
    public boolean f326507d;

    /* renamed from: e */
    public C147346d f326508e;

    /* renamed from: f */
    private final Context f326509f;

    /* renamed from: g */
    private final List f326510g;

    /* renamed from: h */
    private final ServiceConnection f326511h = new C117621b(this);

    public C117623d(Context context, C147345c cVar) {
        this.f326506c = cVar;
        this.f326509f = context;
        this.f326510g = new ArrayList();
    }

    /* renamed from: a */
    public final void mo103412a() {
        C22872h.m42743c(C0825a.class);
        C58976aa aaVar = C58975e.f156826a;
        if (!this.f326507d) {
            this.f326507d = true;
            Intent intent = new Intent("com.google.android.apps.accessibility.voiceaccess.AGSA_CONNECTION");
            intent.setPackage("com.google.android.apps.accessibility.voiceaccess");
            if (!this.f326509f.bindService(intent, this.f326511h, 1)) {
                throw new RemoteException("Unable to bind to the Voice Access app.");
            }
        }
    }

    /* renamed from: b */
    public final void mo103413b() {
        C22872h.m42743c(C0825a.class);
        C58976aa aaVar = C58975e.f156826a;
        this.f326507d = false;
        if (mo103416e()) {
            try {
                this.f326509f.unbindService(this.f326511h);
            } catch (IllegalArgumentException e) {
                C59104x d = f326504a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "VoiceAccessServiceConn");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(33591)).mo56386p("IllegalArgumentException when unbinding.");
                int i = C90755l.f253831a;
            }
        }
        this.f326510g.clear();
    }

    /* renamed from: c */
    public final void mo103414c(VoiceAccessClientEventData voiceAccessClientEventData) {
        C22872h.m42743c(C0825a.class);
        this.f326510g.add(voiceAccessClientEventData);
        mo103415d();
    }

    /* renamed from: d */
    public final void mo103415d() {
        C58976aa aaVar = C58975e.f156826a;
        while (this.f326508e != null && !this.f326510g.isEmpty()) {
            try {
                C147346d dVar = this.f326508e;
                if (dVar != null) {
                    Parcel gA = dVar.mo17260gA();
                    C8850c.m23497f(gA, (VoiceAccessClientEventData) this.f326510g.get(0));
                    dVar.mo17263hf(1, gA);
                    this.f326510g.remove(0);
                }
            } catch (RemoteException e) {
                C59104x c = f326504a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "VoiceAccessServiceConn");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(33594)).mo56386p("Sending event failed.");
                return;
            }
        }
    }

    /* renamed from: e */
    public final boolean mo103416e() {
        return this.f326508e != null;
    }
}
