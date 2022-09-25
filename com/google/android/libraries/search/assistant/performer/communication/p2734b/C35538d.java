package com.google.android.libraries.search.assistant.performer.communication.p2734b;

import android.database.Cursor;
import com.google.android.libraries.search.assistant.performer.communication.C35514ag;
import com.google.android.libraries.search.assistant.performer.communication.C35515ah;
import com.google.android.libraries.search.assistant.performer.communication.C35598d;
import com.google.assistant.p3897e.p3921j.C52297mn;
import com.google.common.p4522b.C58528ij;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.Set;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.b.d */
/* compiled from: PG */
public final /* synthetic */ class C35538d implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C35540f f93321a;

    /* renamed from: b */
    public final /* synthetic */ C58528ij f93322b;

    /* renamed from: c */
    public final /* synthetic */ String f93323c;

    /* renamed from: d */
    public final /* synthetic */ Cursor f93324d;

    /* renamed from: e */
    public final /* synthetic */ int f93325e;

    /* renamed from: f */
    public final /* synthetic */ Set f93326f;

    /* renamed from: g */
    public final /* synthetic */ C52297mn f93327g;

    public /* synthetic */ C35538d(C35540f fVar, C58528ij ijVar, String str, Cursor cursor, int i, Set set, C52297mn mnVar) {
        this.f93321a = fVar;
        this.f93322b = ijVar;
        this.f93323c = str;
        this.f93324d = cursor;
        this.f93325e = i;
        this.f93326f = set;
        this.f93327g = mnVar;
    }

    public final C60870cx apply(Object obj) {
        C35540f fVar = this.f93321a;
        C58528ij ijVar = this.f93322b;
        String str = this.f93323c;
        Cursor cursor = this.f93324d;
        int i = this.f93325e;
        Set set = this.f93326f;
        C52297mn mnVar = this.f93327g;
        Optional optional = (Optional) obj;
        if (optional.isPresent() && ((C35515ah) optional.get()).mo39686a() != null) {
            String a = ((C35515ah) optional.get()).mo39686a();
            a.getClass();
            if (ijVar.contains(Long.valueOf(Long.parseLong(a)))) {
                C35514ag d = C35515ah.m63872d();
                C35598d dVar = (C35598d) d;
                dVar.f93432a = ((C35515ah) optional.get()).mo39686a();
                dVar.f93433b = ((C35515ah) optional.get()).mo39687b();
                dVar.f93434c = str;
                return C60856cj.m92900i(Optional.m71637of(d.mo39685a()));
            }
        }
        return fVar.mo39694c(cursor, i + 1, ijVar, set, mnVar);
    }
}
