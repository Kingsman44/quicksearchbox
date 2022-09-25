package com.google.android.apps.gsa.search.shared.actions.modular.arguments;

import android.content.res.Resources;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.search.shared.actions.modular.p6922a.C87429c;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59071e;
import com.google.p4152bb.p4153a.C55133hb;
import com.google.p4152bb.p4153a.C55134hc;
import com.google.p4152bb.p4153a.C55177is;
import com.google.p4152bb.p4153a.C55211jz;
import com.google.p4152bb.p4153a.C55213ka;
import com.google.p4152bb.p4153a.C55234kv;
import com.google.p4152bb.p4153a.C55235kw;
import com.google.p4152bb.p4153a.C55246lg;
import com.google.p4152bb.p4153a.C55247lh;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* compiled from: PG */
public class AudioArgument extends SingleValueArgument {
    public static final Parcelable.Creator CREATOR = new C87441e();

    /* renamed from: i */
    public static final C59071e f236151i = C59071e.m91332i("com.google.android.apps.gsa.search.shared.actions.modular.arguments.AudioArgument");

    /* renamed from: j */
    public Integer f236152j;

    /* renamed from: k */
    private final C55177is f236153k;

    private AudioArgument(AudioArgument audioArgument, int i) {
        super(audioArgument, (String) audioArgument.f236203n, i);
        this.f236153k = audioArgument.f236153k;
        this.f236152j = audioArgument.f236152j;
    }

    /* renamed from: c */
    public final C87429c mo81250c(C87449m mVar, C55134hc hcVar, Resources resources) {
        if (mo81263C()) {
            C55133hb a = C55133hb.m87600a(hcVar.f145123c);
            if (a == null) {
                a = C55133hb.NONE;
            }
            if (a == C55133hb.ENTITY_VALUE_WITH_AUDIO_URI_FOR_TTS) {
                return new C87429c(Uri.parse((String) this.f236203n));
            }
        }
        return C87429c.f236122a;
    }

    /* renamed from: hB */
    public final boolean mo81260hB() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: hz */
    public final /* bridge */ /* synthetic */ void mo81261hz(Object obj) {
        this.f236203n = C58837ba.m90856e((String) obj);
        this.f236152j = null;
    }

    /* renamed from: m */
    public final /* synthetic */ Argument mo81278m(int i) {
        return new AudioArgument(this, i);
    }

    /* renamed from: n */
    public final C55213ka mo81279n() {
        C55211jz jzVar = (C55211jz) super.mo81279n().toBuilder();
        C55234kv kvVar = (C55234kv) C55235kw.f145426i.createBuilder();
        C55177is isVar = this.f236153k;
        if (isVar != null) {
            kvVar.copyOnWrite();
            C55235kw kwVar = (C55235kw) kvVar.instance;
            kwVar.f145433e = isVar;
            kwVar.f145429a |= 4;
        }
        if (this.f236203n != null) {
            C55246lg lgVar = (C55246lg) C55247lh.f145477k.createBuilder();
            String str = (String) this.f236203n;
            lgVar.copyOnWrite();
            C55247lh lhVar = (C55247lh) lgVar.instance;
            str.getClass();
            lhVar.f145479a |= 16;
            lhVar.f145482d = str;
            kvVar.copyOnWrite();
            C55235kw kwVar2 = (C55235kw) kvVar.instance;
            C55247lh lhVar2 = (C55247lh) lgVar.build();
            lhVar2.getClass();
            kwVar2.mo54213a();
            kwVar2.f145431c.add(lhVar2);
        }
        jzVar.mo58885m(C55235kw.f145427j, (C55235kw) kvVar.build());
        return (C55213ka) jzVar.build();
    }

    /* renamed from: p */
    public final Object mo81281p(C87440d dVar) {
        return dVar.mo81365l();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        ProtoLiteParcelable.m147140k(mo81279n(), parcel);
        parcel.writeValue(this.f236152j);
    }

    public AudioArgument(C55213ka kaVar, String str, Integer num) {
        super(kaVar, str);
        Object obj;
        C55177is isVar;
        C62940bt r3 = C62942bv.checkIsLite(C55235kw.f145427j);
        kaVar.mo58887l(r3);
        Object l = kaVar.f169962ag.mo58854l(r3.f169971d);
        if (l == null) {
            obj = r3.f169969b;
        } else {
            obj = r3.mo58889c(l);
        }
        C55235kw kwVar = (C55235kw) obj;
        if ((kwVar.f145429a & 4) != 0) {
            isVar = kwVar.f145433e;
            if (isVar == null) {
                isVar = C55177is.f145255c;
            }
        } else {
            isVar = null;
        }
        this.f236153k = isVar;
        this.f236152j = num;
    }
}
