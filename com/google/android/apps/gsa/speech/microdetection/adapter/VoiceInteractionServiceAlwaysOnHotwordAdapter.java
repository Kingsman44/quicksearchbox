package com.google.android.apps.gsa.speech.microdetection.adapter;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.core.p094f.C1888a;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.speech.dumper.C90548ak;
import com.google.android.apps.gsa.shared.speech.dumper.C90552e;
import com.google.android.apps.gsa.shared.speech.dumper.EventForDump;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.shared.util.p7184t.C91090a;
import com.google.android.apps.gsa.shared.util.p7184t.C91096f;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.googlequicksearchbox.R;
import com.google.android.voiceinteraction.C45390as;
import com.google.apps.tiktok.inject.C47266f;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4526f.p4534f.C59081b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
public final class VoiceInteractionServiceAlwaysOnHotwordAdapter implements C92518d {

    /* renamed from: a */
    public static final C59071e f258195a = C59071e.m91332i("com.google.android.apps.gsa.speech.microdetection.adapter.VoiceInteractionServiceAlwaysOnHotwordAdapter");

    /* renamed from: b */
    public final Context f258196b;

    /* renamed from: c */
    public final C90929bz f258197c;

    /* renamed from: d */
    public final AtomicBoolean f258198d = new AtomicBoolean(false);

    /* renamed from: e */
    public final AtomicReference f258199e = new AtomicReference(new ArrayList());

    /* renamed from: f */
    public C45390as f258200f;

    /* renamed from: g */
    public ServiceConnection f258201g;

    /* renamed from: h */
    public boolean f258202h;

    /* renamed from: i */
    public final AtomicBoolean f258203i = new AtomicBoolean(false);

    /* renamed from: j */
    public String f258204j;

    /* renamed from: k */
    public int f258205k = -1;

    /* renamed from: l */
    private final C89994f f258206l;

    /* renamed from: m */
    private final ComponentName f258207m;

    /* renamed from: n */
    private final C90548ak f258208n;

    /* compiled from: PG */
    public class ManageActionResultCallback implements Parcelable, C91096f {
        public static final Parcelable.Creator CREATOR = new C92526l();

        /* renamed from: a */
        public C89994f f258209a;

        /* renamed from: b */
        private final int f258210b;

        /* renamed from: c */
        private final C92517c f258211c;

        /* renamed from: com.google.android.apps.gsa.speech.microdetection.adapter.VoiceInteractionServiceAlwaysOnHotwordAdapter$ManageActionResultCallback$a */
        /* compiled from: PG */
        public interface C92514a {
            /* renamed from: qp */
            void mo87289qp(ManageActionResultCallback manageActionResultCallback);
        }

        public ManageActionResultCallback(int i, C92517c cVar) {
            this.f258210b = i;
            this.f258211c = cVar;
        }

        public final int describeContents() {
            return 0;
        }

        /* renamed from: hg */
        public final boolean mo17703hg(int i, Intent intent, Context context) {
            boolean z = i == -1;
            C58976aa aaVar = C58975e.f156826a;
            if (z) {
                ((C92514a) C47266f.m84076a(context, C92514a.class)).mo87289qp(this);
                int i2 = this.f258210b;
                if (i2 == 1 || i2 == 2) {
                    this.f258209a.mo83812a(true);
                } else if (i2 == 3) {
                    this.f258209a.mo83812a(false);
                }
            }
            C92517c cVar = this.f258211c;
            if (cVar != null) {
                cVar.mo87049a(z);
            }
            if (context instanceof Activity) {
                ((Activity) context).overridePendingTransition(R.anim.fast_fade_in, R.anim.fast_fade_out);
            }
            return true;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f258210b);
            C92517c cVar = this.f258211c;
            if (cVar instanceof Parcelable) {
                parcel.writeParcelable((Parcelable) cVar, i);
            }
        }
    }

    public VoiceInteractionServiceAlwaysOnHotwordAdapter(Context context, C89994f fVar, C90929bz bzVar, ComponentName componentName, C90548ak akVar) {
        C58976aa aaVar = C58975e.f156826a;
        this.f258196b = context;
        this.f258206l = fVar;
        this.f258197c = bzVar;
        this.f258207m = componentName;
        this.f258208n = akVar;
    }

    /* renamed from: o */
    private final int m152181o() {
        if (this.f258202h) {
            try {
                int a = this.f258200f.mo49490a(this.f258204j);
                C58976aa aaVar = C58975e.f156826a;
                return a;
            } catch (UnsupportedOperationException e) {
                C59104x c = f258195a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "VISHotwordAdapter");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(12663)).mo56386p("Exception retrieving hotword availability");
            } catch (RemoteException e2) {
                C59104x c2 = f258195a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "VISHotwordAdapter");
                ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e2)).mo56372aa(12664)).mo56386p("Exception retrieving hotword availability");
            }
        }
        C58976aa aaVar2 = C58975e.f156826a;
        return 0;
    }

    /* renamed from: p */
    private final int m152182p() {
        int i = this.f258205k;
        if (i != -1) {
            return i;
        }
        if (this.f258202h) {
            try {
                int o = m152181o();
                if (o != 2) {
                    if (o != 1) {
                        C58976aa aaVar = C58975e.f156826a;
                        this.f258205k = 0;
                        return this.f258205k;
                    }
                }
                this.f258205k = this.f258200f.mo49491b(this.f258204j);
                C58976aa aaVar2 = C58975e.f156826a;
                return this.f258205k;
            } catch (RemoteException e) {
                C59104x c = f258195a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "VISHotwordAdapter");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(12666)).mo56386p("Exception retrieving recognition modes");
            }
        }
        C58976aa aaVar3 = C58975e.f156826a;
        return 0;
    }

    /* renamed from: a */
    public final void mo87273a(C92515a aVar) {
        C58976aa aaVar = C58975e.f156826a;
        if (!this.f258202h && !this.f258203i.get()) {
            C59104x b = f258195a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "VISHotwordAdapter");
            ((C59052c) ((C59052c) b).mo56372aa(12673)).mo56386p("Not connected and not waiting for connection.");
            Intent action = new Intent().setComponent(this.f258207m).setAction("android.voiceinteraction.GsaVoiceInteractionService");
            C92522h hVar = new C92522h(this);
            this.f258201g = hVar;
            this.f258196b.bindService(action, hVar, 1);
            this.f258199e.getAndSet(new ArrayList());
            this.f258203i.getAndSet(true);
        }
        if (aVar != null) {
            mo87276d(aVar);
        }
    }

    /* renamed from: b */
    public final void mo87274b() {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f258202h) {
            try {
                this.f258196b.unbindService(this.f258201g);
            } catch (IllegalArgumentException e) {
                C59104x c = f258195a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "VISHotwordAdapter");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(12675)).mo56386p("IllegalArgumentException when unbinding.");
            }
            this.f258202h = false;
        }
    }

    /* renamed from: c */
    public final void mo87275c(C92516b bVar) {
        String Z = this.f258206l.mo83863Z();
        String s = this.f258206l.mo83830s();
        C58976aa aaVar = C58975e.f156826a;
        if (this.f258202h) {
            try {
                if (!this.f258200f.mo49502m(Z, s, new C92523i(this, Z, bVar))) {
                    mo87274b();
                } else {
                    return;
                }
            } catch (RemoteException e) {
                C59104x c = f258195a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "VISHotwordAdapter");
                ((C59052c) ((C59052c) c).mo56372aa(12679)).mo56389s("Remote Exception %s", e.getMessage());
            }
        }
        if (bVar != null) {
            bVar.mo49375a(false);
        }
    }

    /* renamed from: d */
    public final void mo87276d(C92515a aVar) {
        String str;
        C58976aa aaVar = C58975e.f156826a;
        if (this.f258203i.get()) {
            C59104x b = f258195a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "VISHotwordAdapter");
            ((C59052c) ((C59052c) b).mo56372aa(12683)).mo56386p("Still waiting for connection; add the callback to callback list");
            ((List) this.f258199e.get()).add(aVar);
        } else if (!this.f258202h || ((str = this.f258204j) != null && str.equals(this.f258206l.mo83863Z()))) {
            C59104x d = f258195a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "VISHotwordAdapter");
            ((C59052c) ((C59052c) d).mo56372aa(12682)).mo56358K("Not waiting for connection! hdmUsed %b, connected %b", this.f258198d.get(), this.f258202h);
            if (this.f258198d.get()) {
                aVar.mo49376b();
            } else {
                aVar.mo49375a(this.f258202h);
            }
        } else {
            mo87275c(new C92520f(aVar));
        }
    }

    /* renamed from: e */
    public final boolean mo87277e() {
        C58976aa aaVar = C58975e.f156826a;
        return this.f258202h;
    }

    /* renamed from: f */
    public final boolean mo87278f() {
        C58976aa aaVar = C58975e.f156826a;
        return m152181o() == 2;
    }

    /* renamed from: g */
    public final boolean mo87279g() {
        C58976aa aaVar = C58975e.f156826a;
        return this.f258202h && m152181o() != -2;
    }

    /* renamed from: h */
    public final boolean mo87280h() {
        C58976aa aaVar = C58975e.f156826a;
        return (m152182p() & 2) != 0;
    }

    /* renamed from: i */
    public final boolean mo87281i() {
        C58976aa aaVar = C58975e.f156826a;
        return (m152182p() & 1) != 0;
    }

    /* renamed from: j */
    public final boolean mo87282j() {
        C58976aa aaVar = C58975e.f156826a;
        if (!this.f258202h) {
            C59104x b = f258195a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "VISHotwordAdapter");
            ((C59052c) ((C59052c) b).mo56372aa(12692)).mo56386p("#isLanguageSupported HotwordAdapter not connected.");
            return false;
        }
        int o = m152181o();
        if (o == -1) {
            C59104x b2 = f258195a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "VISHotwordAdapter");
            ((C59052c) ((C59052c) b2).mo56372aa(12691)).mo56386p("#isLanguageSupported keyphrase unsupported.");
            return false;
        } else if (o != -2) {
            return true;
        } else {
            C59104x b3 = f258195a.mo56224b();
            b3.mo56378ag(C58975e.f156826a, "VISHotwordAdapter");
            ((C59052c) ((C59052c) b3).mo56372aa(12690)).mo56386p("#isLanguageSupported hardware unavailable.");
            return false;
        }
    }

    /* renamed from: k */
    public final boolean mo87283k() {
        C58976aa aaVar = C58975e.f156826a;
        if (!this.f258202h) {
            return false;
        }
        try {
            return this.f258200f.mo49503n();
        } catch (RemoteException e) {
            C59104x c = f258195a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "VISHotwordAdapter");
            ((C59052c) ((C59052c) c).mo56372aa(12694)).mo56389s("Remote Exception %s", e.getMessage());
            return false;
        }
    }

    /* renamed from: l */
    public final void mo87284l(boolean z, C92516b bVar, EventForDump eventForDump) {
        C58976aa aaVar = C58975e.f156826a;
        C59081b.m91349a(C58979ad.FULL, "stack size");
        C58838bb.m90884s(this.f258197c != null, "mTaskRunner should not be null if the adapter is used to set recognition state.");
        if (this.f258202h && mo87278f()) {
            this.f258197c.mo85139d(new C92525k(this, z, bVar));
            this.f258208n.mo84667a(C90552e.RECOGNITION_STATE, eventForDump, String.valueOf(z));
        }
    }

    /* renamed from: m */
    public final void mo87285m(C91097g gVar, C92517c cVar) {
        C59104x b = f258195a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "VISHotwordAdapter");
        ((C59052c) ((C59052c) b).mo56372aa(12699)).mo56386p("#startEnroll");
        m152183q(1, gVar, cVar);
    }

    /* renamed from: n */
    public final void mo87286n(C91097g gVar, C92517c cVar) {
        C59104x b = f258195a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "VISHotwordAdapter");
        ((C59052c) ((C59052c) b).mo56372aa(12703)).mo56386p("#startUnenroll");
        m152183q(3, gVar, cVar);
    }

    /* renamed from: q */
    private final void m152183q(int i, C91097g gVar, C92517c cVar) {
        Intent intent;
        if (!C1888a.m5148b()) {
            if (i != 1) {
                C58838bb.m90871f(gVar.mo65092d(), "mIntentStarter should support startActivityForResult in order to send manage intents, action=%s", i);
            }
            if (this.f258202h) {
                if (i == 1) {
                    intent = this.f258200f.mo49493d(this.f258204j);
                } else if (i != 2) {
                    try {
                        intent = this.f258200f.mo49495f(this.f258204j);
                    } catch (RemoteException e) {
                        C59104x c = f258195a.mo56225c();
                        c.mo56378ag(C58975e.f156826a, "VISHotwordAdapter");
                        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(12697)).mo56386p("Exception sending the manage intent");
                    }
                } else {
                    intent = this.f258200f.mo49494e(this.f258204j);
                }
                if (gVar instanceof C91090a) {
                    intent.putExtra("com.google.android.apps.gsa.shared.util.starter.IntentStarter.USE_TRANSITION", 1);
                }
                if (gVar.mo65092d()) {
                    C59104x b = f258195a.mo56224b();
                    b.mo56378ag(C58975e.f156826a, "VISHotwordAdapter");
                    ((C59052c) ((C59052c) b).mo56372aa(12702)).mo56389s("Firing intent: %s", i != 1 ? i != 2 ? "unenroll" : "reenroll" : "enroll");
                    gVar.mo65090b(intent, new ManageActionResultCallback(i, cVar));
                } else {
                    try {
                        gVar.mo65089a(intent);
                    } catch (Exception e2) {
                        C59104x c2 = f258195a.mo56225c();
                        c2.mo56378ag(C58975e.f156826a, "VISHotwordAdapter");
                        ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e2)).mo56372aa(12701)).mo56386p("startActivity is not supported by DSP Enrollment");
                        return;
                    }
                }
                C58976aa aaVar = C58975e.f156826a;
                return;
            }
            C58976aa aaVar2 = C58975e.f156826a;
        } else if (cVar != null) {
            cVar.mo87049a(true);
        }
    }
}
