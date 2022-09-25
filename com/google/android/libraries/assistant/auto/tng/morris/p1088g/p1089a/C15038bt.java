package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1089a;

import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14129bc;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14132bf;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14216b;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14291du;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14292dv;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14361gj;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f.C15346t;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f.C15352z;
import com.google.android.libraries.assistant.p1478e.p1479a.p1480a.C17939a;
import com.google.android.libraries.logging.p2185ve.C28353e;
import com.google.assistant.p3745ab.C48258bo;
import com.google.assistant.p3745ab.C48260bq;
import com.google.assistant.p3745ab.p3766r.C48385a;
import com.google.assistant.p3745ab.p3766r.C48390f;
import com.google.assistant.p3745ab.p3766r.C48391g;
import com.google.assistant.p3745ab.p3766r.C48392h;
import com.google.protobuf.C62940bt;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.a.bt */
/* compiled from: PG */
public final class C15038bt extends C0640fb {

    /* renamed from: a */
    public final ContextThemeWrapper f45101a;

    /* renamed from: b */
    public final C15352z f45102b;

    /* renamed from: c */
    public final C14986h f45103c;

    /* renamed from: d */
    public final C14132bf f45104d;

    /* renamed from: e */
    public final C15346t f45105e;

    /* renamed from: f */
    private final List f45106f;

    /* renamed from: g */
    private final int f45107g;

    public C15038bt(ContextThemeWrapper contextThemeWrapper, C15352z zVar, int i, List list, C14986h hVar, C14132bf bfVar, C15346t tVar) {
        this.f45101a = contextThemeWrapper;
        this.f45102b = zVar;
        this.f45107g = i;
        this.f45106f = list;
        this.f45103c = hVar;
        this.f45104d = bfVar;
        this.f45105e = tVar;
    }

    /* renamed from: a */
    public final void mo21911a(View view, int i, C14292dv dvVar) {
        C14132bf bfVar = this.f45104d;
        C14216b bVar = dvVar.f43239e;
        if (bVar == null) {
            bVar = C14216b.f43007f;
        }
        String str = bVar.f43011c;
        C14216b bVar2 = dvVar.f43239e;
        String str2 = (bVar2 == null ? C14216b.f43007f : bVar2).f43012d;
        if (bVar2 == null) {
            bVar2 = C14216b.f43007f;
        }
        String str3 = bVar2.f43013e;
        C62940bt btVar = C17939a.f51392b;
        C48385a aVar = (C48385a) C48392h.f125083c.createBuilder();
        C48390f fVar = (C48390f) C48391g.f125079c.createBuilder();
        C48258bo boVar = (C48258bo) C48260bq.f124825o.createBuilder();
        boVar.copyOnWrite();
        C48260bq bqVar = (C48260bq) boVar.instance;
        str.getClass();
        bqVar.f124827a |= 1;
        bqVar.f124828b = str;
        boVar.copyOnWrite();
        C48260bq bqVar2 = (C48260bq) boVar.instance;
        str2.getClass();
        bqVar2.f124827a |= 2;
        bqVar2.f124829c = str2;
        boVar.copyOnWrite();
        C48260bq bqVar3 = (C48260bq) boVar.instance;
        str3.getClass();
        bqVar3.f124827a |= 4;
        bqVar3.f124830d = str3;
        fVar.copyOnWrite();
        C48391g gVar = (C48391g) fVar.instance;
        C48260bq bqVar4 = (C48260bq) boVar.build();
        bqVar4.getClass();
        gVar.f125082b = bqVar4;
        gVar.f125081a = 2;
        aVar.copyOnWrite();
        C48392h hVar = (C48392h) aVar.instance;
        C48391g gVar2 = (C48391g) fVar.build();
        gVar2.getClass();
        hVar.f125087b = gVar2;
        hVar.f125086a |= 1;
        bfVar.mo21445b(view, i, new C28353e(btVar, (C48392h) aVar.build()));
    }

    public final int getItemCount() {
        int i = this.f45107g - 2;
        if (i == 1) {
            return 8;
        }
        if (i != 2) {
            return 0;
        }
        return this.f45106f.size();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        r5 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14291du.m30597a(((com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14292dv) r4.f45106f.get(r5)).f43250p);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int getItemViewType(int r5) {
        /*
            r4 = this;
            int r0 = r4.f45107g
            int r0 = r0 + -2
            r1 = 2
            if (r0 == r1) goto L_0x0009
            r5 = 0
            return r5
        L_0x0009:
            java.util.List r0 = r4.f45106f
            java.lang.Object r0 = r0.get(r5)
            com.google.android.libraries.assistant.auto.tng.morris.e.dv r0 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14292dv) r0
            int r0 = r0.f43250p
            int r0 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14291du.m30597a(r0)
            r2 = 1
            if (r0 != 0) goto L_0x001b
            goto L_0x001f
        L_0x001b:
            r3 = 3
            if (r0 != r3) goto L_0x001f
            return r2
        L_0x001f:
            java.util.List r0 = r4.f45106f
            java.lang.Object r5 = r0.get(r5)
            com.google.android.libraries.assistant.auto.tng.morris.e.dv r5 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14292dv) r5
            int r5 = r5.f43250p
            int r5 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14291du.m30597a(r5)
            if (r5 != 0) goto L_0x0030
            goto L_0x0034
        L_0x0030:
            r0 = 4
            if (r5 != r0) goto L_0x0034
            return r1
        L_0x0034:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1089a.C15038bt.getItemViewType(int):int");
    }

    public final void onBindViewHolder(C0673gh ghVar, int i) {
        C14361gj gjVar;
        int i2 = 2;
        if (getItemViewType(i) == 1) {
            C15037bs bsVar = (C15037bs) ghVar;
            C14292dv dvVar = (C14292dv) this.f45106f.get(i);
            bsVar.f45099d = dvVar;
            ImageView imageView = bsVar.f45098c;
            int i3 = dvVar.f43237c;
            if (i3 == 0) {
                i2 = 3;
            } else if (i3 == 14) {
                i2 = 1;
            } else if (i3 != 15) {
                i2 = 0;
            }
            int i4 = i2 - 1;
            if (i2 != 0) {
                if (i4 == 0) {
                    bsVar.f45100e.f45102b.mo22231n(imageView, i3 == 14 ? (String) dvVar.f43238d : BuildConfig.FLAVOR, new C15036br(bsVar));
                } else if (i4 != 1) {
                    bsVar.mo21909a(imageView);
                } else {
                    C15352z zVar = bsVar.f45100e.f45102b;
                    if (i3 == 15) {
                        gjVar = (C14361gj) dvVar.f43238d;
                    } else {
                        gjVar = C14361gj.f43456e;
                    }
                    zVar.mo22229l(imageView, gjVar, new C15036br(bsVar));
                }
                bsVar.f45096a.setText(dvVar.f43241g);
                if (dvVar.f43242h.isEmpty()) {
                    bsVar.f45097b.setVisibility(8);
                } else {
                    bsVar.f45097b.setText(dvVar.f43242h);
                }
                int i5 = dvVar.f43250p;
                int a = C14291du.m30597a(i5);
                if (a != 0 && a == 3) {
                    bsVar.f45100e.f45105e.mo22217g(bsVar.itemView, dvVar, false);
                } else {
                    int a2 = C14291du.m30597a(i5);
                    if (a2 != 0 && a2 == 4) {
                        bsVar.itemView.setContentDescription(bsVar.f45100e.f45101a.getString(R.string.media_tree_browse_open_folder_description));
                    }
                }
                bsVar.f45100e.mo21911a(bsVar.itemView, 126621, dvVar);
                return;
            }
            throw null;
        } else if (getItemViewType(i) == 2) {
            C15035bq bqVar = (C15035bq) ghVar;
            C14292dv dvVar2 = (C14292dv) this.f45106f.get(i);
            bqVar.f45093b = dvVar2;
            bqVar.f45092a.setText(dvVar2.f43241g);
            bqVar.f45094c.mo21911a(bqVar.itemView, 126622, dvVar2);
        } else if (getItemViewType(i) == 0) {
            C15352z.m31953e(ghVar.itemView, ((long) i) * C15352z.f46062c.toMillis());
        }
    }

    public final void onViewRecycled(C0673gh ghVar) {
        if (ghVar instanceof C15037bs) {
            C15037bs bsVar = (C15037bs) ghVar;
            bsVar.f45100e.f45104d.mo21447d(bsVar.itemView);
            bsVar.f45099d = null;
            bsVar.f45097b.setVisibility(0);
        } else if (ghVar instanceof C15035bq) {
            C15035bq bqVar = (C15035bq) ghVar;
            bqVar.f45094c.f45104d.mo21447d(bqVar.itemView);
            bqVar.f45093b = null;
        }
    }

    public final C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 1) {
            C15037bs bsVar = new C15037bs(this, LayoutInflater.from(this.f45101a).inflate(R.layout.media_browse_tree_menu_playable_item, viewGroup, false));
            bsVar.itemView.setOnClickListener(new C14129bc(bsVar.f45100e.f45104d, Optional.empty(), bsVar));
            return bsVar;
        } else if (i != 2) {
            return new C15034bp(LayoutInflater.from(this.f45101a).inflate(R.layout.media_browse_tree_loading_card, viewGroup, false));
        } else {
            C15035bq bqVar = new C15035bq(this, LayoutInflater.from(this.f45101a).inflate(R.layout.media_browse_tree_menu_browsable_item, viewGroup, false));
            bqVar.itemView.setOnClickListener(new C14129bc(bqVar.f45094c.f45104d, Optional.empty(), bqVar));
            return bqVar;
        }
    }
}
