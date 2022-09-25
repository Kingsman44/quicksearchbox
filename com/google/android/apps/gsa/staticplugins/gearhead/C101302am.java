package com.google.android.apps.gsa.staticplugins.gearhead;

import android.os.RemoteException;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.projection.p6477a.C84184a;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.protos.p4816ai.p4818b.C63196b;

/* renamed from: com.google.android.apps.gsa.staticplugins.gearhead.am */
/* compiled from: PG */
public final /* synthetic */ class C101302am implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C101325be f282713a;

    /* renamed from: b */
    public final /* synthetic */ Boolean f282714b;

    public /* synthetic */ C101302am(C101325be beVar, Boolean bool) {
        this.f282713a = beVar;
        this.f282714b = bool;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C101325be beVar = this.f282713a;
        Boolean bool = this.f282714b;
        Boolean bool2 = (Boolean) obj;
        boolean booleanValue = bool2.booleanValue();
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 1521;
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        ufVar2.f164146b |= 1048576;
        ufVar2.f164081O = booleanValue;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
        if (bool.booleanValue()) {
            C84184a aVar = beVar.f282787q;
            aVar.f229168c = null;
            aVar.f229169d = null;
            beVar.f282773c.mo20152e(false);
        }
        if (!bool2.booleanValue()) {
            try {
                beVar.f282783m.mo117445g();
            } catch (RemoteException e) {
                ((C58970a) ((C58970a) ((C58970a) C101325be.f282743a.mo56225c()).mo56382g(e)).mo56372aa(19992)).mo56386p("Client callback onVoiceSessionEnd() failed");
            }
        }
        beVar.f282773c.mo20153f(false);
        return BuildConfig.FLAVOR;
    }
}
