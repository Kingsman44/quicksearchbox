package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.p031v4.media.MediaDescriptionCompat;
import android.support.p031v4.media.MediaMetadataCompat;
import android.support.p031v4.media.session.C0315q;
import android.support.p031v4.media.session.C0320v;
import android.support.p033v7.widget.C0673gh;
import android.text.TextUtils;
import android.view.View;
import androidx.p060c.C0977g;
import com.google.android.apps.gsa.staticplugins.opa.tapas.logging.C112694be;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113259al;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113294bs;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113342cm;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113367dh;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113375dp;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113427g;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8582f.C113417a;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Map;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.dy */
/* compiled from: PG */
public final class C112826dy implements C113342cm {

    /* renamed from: a */
    public static final C59071e f312716a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.m.dy");

    /* renamed from: b */
    public final Context f312717b;

    /* renamed from: c */
    public final C113367dh f312718c;

    /* renamed from: d */
    public final Map f312719d = new C0977g();

    /* renamed from: e */
    private final C113417a f312720e;

    /* renamed from: f */
    private final C112794ct f312721f;

    /* renamed from: g */
    private final C112694be f312722g;

    /* renamed from: h */
    private final C113375dp f312723h;

    public C112826dy(Context context, C113417a aVar, C112794ct ctVar, C112694be beVar, C113375dp dpVar, C113367dh dhVar) {
        this.f312717b = context;
        this.f312720e = aVar;
        this.f312721f = ctVar;
        this.f312722g = beVar;
        this.f312723h = dpVar;
        this.f312718c = dhVar;
    }

    /* renamed from: j */
    private final C112825dx m186742j(C113415ez ezVar, C113427g gVar) {
        C58838bb.m90868c(ezVar.mo100226z().isPresent());
        if (this.f312719d.containsKey(ezVar)) {
            return (C112825dx) this.f312719d.get(ezVar);
        }
        C0320v a = this.f312720e.mo100227a(((C113294bs) ezVar.mo100226z().get()).mo99971b());
        C112825dx dxVar = new C112825dx(this, ezVar, a, this.f312723h, gVar);
        a.mo1040h(dxVar, (Handler) null);
        this.f312719d.put(ezVar, dxVar);
        C58976aa aaVar = C58975e.f156826a;
        return dxVar;
    }

    /* renamed from: k */
    private final void m186743k(C113415ez ezVar) {
        C58800sl lA = C58528ij.m90006F(this.f312719d.keySet()).iterator();
        while (lA.hasNext()) {
            C113415ez ezVar2 = (C113415ez) lA.next();
            if (!ezVar2.equals(ezVar)) {
                C112825dx dxVar = (C112825dx) this.f312719d.get(ezVar2);
                dxVar.getClass();
                dxVar.mo99745o();
            }
        }
    }

    /* renamed from: a */
    public final int mo99713a() {
        return R.layout.media_suggestion_item;
    }

    /* renamed from: b */
    public final int mo99684b(C113415ez ezVar) {
        return 85779;
    }

    /* renamed from: c */
    public final C0673gh mo99714c(View view) {
        return new C112824dw(view);
    }

    /* renamed from: d */
    public final /* synthetic */ Optional mo99715d(C113415ez ezVar) {
        return Optional.empty();
    }

    /* renamed from: e */
    public final /* synthetic */ Optional mo99716e(C0673gh ghVar) {
        return Optional.empty();
    }

    /* renamed from: f */
    public final void mo99685f(C113408es esVar, C113415ez ezVar, C0673gh ghVar, C113427g gVar) {
        C59104x b = f312716a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "MediaSgstRndrer");
        ((C59052c) ((C59052c) b).mo56372aa(27812)).mo56386p("#handleOnClick()");
        C58838bb.m90868c(ezVar.mo100226z().isPresent());
        this.f312721f.mo99739a(7, ezVar, esVar, Optional.empty());
        C112824dw dwVar = (C112824dw) ghVar;
        if (!dwVar.f312706e) {
            this.f312722g.mo99654e(ghVar.itemView);
            dwVar.f312706e = true;
        }
        C113294bs bsVar = (C113294bs) ezVar.mo100226z().get();
        C0320v a = this.f312720e.mo100227a(bsVar.mo99971b());
        C0315q e = a.mo1037e();
        C112825dx dxVar = (C112825dx) this.f312719d.get(ezVar);
        if (dxVar != null) {
            int i = dxVar.f312710g;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            } else if (i2 == 1) {
                dxVar.f312708e = !dxVar.f312708e;
            } else if (i2 == 2) {
                e.mo1017b();
            } else if (i2 == 3) {
                e.mo1018c();
                m186743k(ezVar);
            }
        } else {
            m186742j(ezVar, gVar).f312710g = 2;
            String str = bsVar.mo99970a().f932a;
            if (str != null) {
                a.mo1037e().mo1019d(str, Bundle.EMPTY);
            }
            m186743k(ezVar);
        }
        gVar.mo100230a(ezVar);
    }

    /* renamed from: g */
    public final /* synthetic */ void mo99717g(C113415ez ezVar, View view) {
    }

    /* renamed from: h */
    public final void mo99686h(C113408es esVar, C113415ez ezVar, C0673gh ghVar, C113427g gVar) {
        C112825dx dxVar;
        MediaDescriptionCompat mediaDescriptionCompat;
        Optional optional;
        int i;
        C58976aa aaVar = C58975e.f156826a;
        if (!ezVar.mo100226z().isEmpty()) {
            C112824dw dwVar = (C112824dw) ghVar;
            C113294bs bsVar = (C113294bs) ezVar.mo100226z().get();
            C0320v a = this.f312720e.mo100227a(bsVar.mo99971b());
            if (this.f312719d.containsKey(ezVar)) {
                dxVar = (C112825dx) this.f312719d.get(ezVar);
                dxVar.f312707d = gVar;
            } else if (bsVar.mo99972c()) {
                dxVar = m186742j(ezVar, gVar);
                if (a.mo1038f().f994a == 3) {
                    dxVar.f312710g = 3;
                } else {
                    dxVar.f312710g = 4;
                }
            } else {
                dxVar = null;
            }
            int i2 = R.drawable.quantum_ic_play_arrow_grey600_36;
            if (dxVar != null && ((i = dxVar.f312710g) == 3 || (i == 2 && !dxVar.f312708e))) {
                i2 = R.drawable.quantum_ic_pause_grey600_36;
            }
            dwVar.f312704c.setImageDrawable(this.f312717b.getDrawable(i2));
            if (bsVar.mo99972c()) {
                MediaMetadataCompat d = a.mo1036d();
                if (d == null) {
                    dwVar.itemView.setVisibility(8);
                    return;
                }
                mediaDescriptionCompat = d.mo819d();
            } else {
                mediaDescriptionCompat = bsVar.mo99970a();
            }
            CharSequence charSequence = mediaDescriptionCompat.f933b;
            dwVar.f312703b.setText(charSequence);
            dwVar.f312703b.setVisibility(0);
            CharSequence charSequence2 = mediaDescriptionCompat.f934c;
            if (TextUtils.isEmpty(charSequence2) || (!TextUtils.isEmpty(charSequence) && charSequence2.toString().contentEquals(charSequence))) {
                dwVar.f312705d.setVisibility(8);
            } else {
                dwVar.f312705d.setVisibility(0);
                dwVar.f312705d.setText(mediaDescriptionCompat.f934c);
            }
            Bitmap bitmap = mediaDescriptionCompat.f936e;
            Uri uri = mediaDescriptionCompat.f937f;
            if (bitmap != null) {
                optional = Optional.m71637of(C113259al.m187317b(new BitmapDrawable(this.f312717b.getResources(), bitmap)));
            } else if (uri != null) {
                optional = Optional.m71637of(C113259al.m187318c(uri.toString()));
            } else {
                optional = Optional.empty();
            }
            optional.ifPresent(new C112823dv(this, dwVar));
        }
    }

    /* renamed from: i */
    public final boolean mo99718i() {
        return true;
    }
}
