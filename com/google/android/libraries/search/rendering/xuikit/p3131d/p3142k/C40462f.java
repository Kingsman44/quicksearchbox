package com.google.android.libraries.search.rendering.xuikit.p3131d.p3142k;

import android.content.Context;
import com.google.android.libraries.elements.interfaces.C21232ab;
import com.google.android.libraries.search.rendering.xuikit.p3097a.p3116d.p3117a.C40063a;
import com.google.android.libraries.search.rendering.xuikit.p3097a.p3116d.p3117a.C40064b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58839bc;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57780l;
import com.google.p4283bv.p4380j.p4385b.p4386a.p4410d.C57761d;
import com.google.p4283bv.p4380j.p4385b.p4386a.p4410d.C57770m;
import com.google.p4283bv.p4380j.p4385b.p4386a.p4410d.C57772o;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63070h;
import java.util.Collections;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.d.k.f */
/* compiled from: PG */
public final class C40462f implements C40064b {

    /* renamed from: a */
    private final Context f106194a;

    /* renamed from: b */
    private final C21232ab f106195b;

    /* renamed from: c */
    private final C58833ax f106196c;

    /* renamed from: d */
    private final C58833ax f106197d;

    public C40462f(Context context, C21232ab abVar, C58833ax axVar, C58833ax axVar2) {
        this.f106194a = context;
        this.f106195b = abVar;
        this.f106196c = axVar;
        this.f106197d = axVar2;
    }

    /* renamed from: a */
    public final void mo42166a(String str) {
        C58833ax axVar = this.f106196c;
        if (axVar.mo56113h()) {
            C58833ax a = ((C40063a) axVar.mo56107c()).mo42165a();
            if (a.mo56113h()) {
                this.f106195b.mo26140c(str, ((C57761d) a.mo56107c()).toByteArray());
            }
        }
    }

    /* renamed from: b */
    public final void mo42167b(String str, C57780l lVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C57772o.f154360b);
        lVar.mo58887l(r0);
        Object l = lVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C57770m mVar = (C57770m) obj;
        C58833ax axVar = this.f106197d;
        if (((!axVar.mo56113h() ? (this.f106194a.getResources().getConfiguration().uiMode & 48) != 32 : true != ((C58839bc) axVar.mo56107c()).mo5941a(this.f106194a)) ? (char) 1 : 2) != 2 || !Collections.unmodifiableMap(mVar.f154358a).containsKey(2)) {
            C21232ab abVar = this.f106195b;
            C62995dn dnVar = mVar.f154358a;
            if (dnVar.containsKey(1)) {
                abVar.mo26140c(str, ((C63070h) dnVar.get(1)).f170218b.mo59174N());
                return;
            }
            throw new IllegalArgumentException();
        }
        C21232ab abVar2 = this.f106195b;
        C62995dn dnVar2 = mVar.f154358a;
        if (dnVar2.containsKey(2)) {
            abVar2.mo26140c(str, ((C63070h) dnVar2.get(2)).f170218b.mo59174N());
            return;
        }
        throw new IllegalArgumentException();
    }
}
