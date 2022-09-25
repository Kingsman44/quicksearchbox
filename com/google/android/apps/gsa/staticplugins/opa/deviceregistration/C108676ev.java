package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.content.C1877c;
import com.google.android.apps.gsa.opaonboarding.p6463ui.checkableflip.p6466a.C83992d;
import com.google.android.apps.gsa.shared.util.C90730an;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3861at.C50094ki;
import com.google.assistant.p3861at.C50105kt;
import com.google.assistant.p3861at.C50106ku;
import com.google.assistant.p3861at.C50119lg;
import com.google.assistant.p3861at.C50121li;
import com.google.assistant.p3861at.C50123lk;
import com.google.common.base.C58831av;
import com.google.common.base.C58833ax;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.util.Iterator;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.ev */
/* compiled from: PG */
final class C108676ev implements C83992d {

    /* renamed from: a */
    final C108741i f302259a;

    /* renamed from: b */
    final boolean f302260b;

    /* renamed from: c */
    final C50094ki f302261c;

    /* renamed from: d */
    final C50121li f302262d;

    /* renamed from: e */
    final /* synthetic */ C108678ex f302263e;

    /* renamed from: f */
    private boolean f302264f;

    public C108676ev(C108678ex exVar, C108741i iVar, boolean z) {
        C50121li liVar;
        this.f302263e = exVar;
        this.f302260b = z;
        this.f302259a = iVar;
        String n = iVar.mo97110n();
        C50094ki kiVar = null;
        if (!C58837ba.m90859h(n)) {
            byte[] byteArray = ((Bundle) C58831av.m90830c(exVar.getArguments(), Bundle.EMPTY)).getByteArray("device-ui-arg");
            if (byteArray == null) {
                C59104x c = C108678ex.f302267b.mo56225c();
                c.mo56378ag(C58975e.f156826a, "MultipleDevicesFrag");
                ((C59052c) ((C59052c) c).mo56372aa(24208)).mo56386p("Didn't find DpsDeviceRegistryUi in args.");
            } else {
                try {
                    Iterator it = ((C50123lk) C62942bv.parseFrom((C62942bv) C50123lk.f130306b, byteArray, C62921ba.m95368a())).f130308a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        liVar = (C50121li) it.next();
                        if (TextUtils.equals(n, liVar.f130303b)) {
                            break;
                        }
                    }
                } catch (C62974ct e) {
                    throw new IllegalArgumentException("Could not deserialize DpsDeviceRegistryUi", e);
                }
            }
        }
        liVar = null;
        this.f302262d = liVar;
        if (liVar != null && (kiVar = liVar.f130304c) == null) {
            kiVar = C50094ki.f130230i;
        }
        this.f302261c = kiVar;
    }

    /* renamed from: a */
    public final /* synthetic */ int mo77436a() {
        return 1;
    }

    /* renamed from: b */
    public final int mo77437b() {
        C50094ki kiVar = this.f302261c;
        if (kiVar == null || (kiVar.f130232a & 16) == 0) {
            return R.drawable.quantum_ic_assistant_device_white_24;
        }
        C50106ku kuVar = kiVar.f130237f;
        if (kuVar == null) {
            kuVar = C50106ku.f130256c;
        }
        int a = C50105kt.m85779a(kuVar.f130258a);
        if (a == 0 || a == 1) {
            return R.drawable.quantum_ic_assistant_device_white_24;
        }
        return 0;
    }

    /* renamed from: c */
    public final Drawable mo77438c() {
        C50094ki kiVar = this.f302261c;
        if (!(kiVar == null || (kiVar.f130232a & 16) == 0)) {
            C50106ku kuVar = kiVar.f130237f;
            if (kuVar == null) {
                kuVar = C50106ku.f130256c;
            }
            int a = C50105kt.m85779a(kuVar.f130258a);
            if (!(a == 0 || a == 1)) {
                C50106ku kuVar2 = this.f302261c.f130237f;
                if (kuVar2 == null) {
                    kuVar2 = C50106ku.f130256c;
                }
                byte[] N = kuVar2.f130259b.mo59174N();
                Bitmap decodeByteArray = N != null ? BitmapFactory.decodeByteArray(N, 0, N.length) : null;
                if (decodeByteArray != null) {
                    return new BitmapDrawable(this.f302263e.getResources(), decodeByteArray);
                }
            }
        }
        return C1877c.m5125a(this.f302263e.getActivity(), R.drawable.quantum_ic_assistant_device_white_24);
    }

    /* renamed from: d */
    public final CharSequence mo77439d() {
        if (this.f302261c != null) {
            return (CharSequence) C58831av.m90830c(this.f302259a.mo97105h(), this.f302261c.f130235d);
        }
        return (CharSequence) C90730an.m148189b(C58833ax.m90833j(this.f302259a.mo97105h()), C58833ax.m90833j(this.f302259a.mo97106i()), C58833ax.m90834k(this.f302259a.mo97104g())).mo56107c();
    }

    /* renamed from: e */
    public final CharSequence mo77440e() {
        if (this.f302260b) {
            return this.f302263e.getString(R.string.device_already_linked_to_you);
        }
        C50121li liVar = this.f302262d;
        if (liVar != null) {
            C50119lg lgVar = liVar.f130305d;
            if (lgVar == null) {
                lgVar = C50119lg.f130295d;
            }
            if ((lgVar.f130297a & 1) != 0) {
                C50119lg lgVar2 = this.f302262d.f130305d;
                if (!(lgVar2 == null ? C50119lg.f130295d : lgVar2).f130298b) {
                    if (((lgVar2 == null ? C50119lg.f130295d : lgVar2).f130297a & 2) != 0) {
                        if (lgVar2 == null) {
                            lgVar2 = C50119lg.f130295d;
                        }
                        return lgVar2.f130299c;
                    }
                }
            }
        }
        C50094ki kiVar = this.f302261c;
        if (kiVar == null) {
            return this.f302259a.mo97106i();
        }
        return (CharSequence) C90730an.m148189b(C58833ax.m90834k(kiVar.f130235d), C58833ax.m90834k(this.f302261c.f130234c), C58833ax.m90834k(this.f302261c.f130236e)).mo56107c();
    }

    /* renamed from: f */
    public final void mo77441f(boolean z) {
        this.f302264f = z;
        this.f302263e.f302270e.setEnabled(true);
    }

    /* renamed from: g */
    public final /* synthetic */ boolean mo77442g() {
        return false;
    }

    /* renamed from: h */
    public final boolean mo77443h() {
        if (this.f302260b) {
            return false;
        }
        C50121li liVar = this.f302262d;
        if (liVar != null) {
            C50119lg lgVar = liVar.f130305d;
            if (lgVar == null) {
                lgVar = C50119lg.f130295d;
            }
            if ((lgVar.f130297a & 1) != 0) {
                C50119lg lgVar2 = this.f302262d.f130305d;
                if (lgVar2 == null) {
                    lgVar2 = C50119lg.f130295d;
                }
                return lgVar2.f130298b;
            }
        }
        return true;
    }

    /* renamed from: i */
    public final boolean mo77444i() {
        return this.f302264f;
    }

    /* renamed from: j */
    public final /* synthetic */ boolean mo77445j() {
        return false;
    }
}
