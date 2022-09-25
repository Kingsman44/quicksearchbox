package com.google.android.play.core.p3538g;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.C146010af;
import com.google.android.p445a.C8850c;
import com.google.android.play.core.common.C45054a;
import com.google.android.play.core.common.p3530a.C45056b;
import com.google.android.play.core.p3533e.C45069a;
import com.google.android.play.core.p3538g.p3540b.C45142a;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: com.google.android.play.core.g.aj */
/* compiled from: PG */
final class C45124aj extends C45069a {

    /* renamed from: a */
    final /* synthetic */ Collection f117810a;

    /* renamed from: b */
    final /* synthetic */ Collection f117811b;

    /* renamed from: c */
    final /* synthetic */ C45054a f117812c;

    /* renamed from: e */
    final /* synthetic */ C146010af f117813e;

    /* renamed from: f */
    final /* synthetic */ C45135au f117814f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45124aj(C45135au auVar, C146010af afVar, Collection collection, Collection collection2, C45054a aVar, C146010af afVar2) {
        super(afVar);
        this.f117814f = auVar;
        this.f117810a = collection;
        this.f117811b = collection2;
        this.f117812c = aVar;
        this.f117813e = afVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo48871a() {
        ArrayList d = C45135au.m80338d(this.f117810a);
        d.addAll(C45135au.m80337c(this.f117811b));
        try {
            this.f117812c.mo48891a(2);
            C45135au auVar = this.f117814f;
            C45142a aVar = (C45142a) auVar.f117832c.f117737m;
            String str = auVar.f117831b;
            C45054a aVar2 = this.f117812c;
            Bundle a = C45135au.m80335a();
            ArrayList arrayList = new ArrayList();
            for (C45056b bVar : aVar2.f117697a) {
                Bundle bundle = new Bundle();
                bundle.putInt("event_type", bVar.mo48892a());
                bundle.putLong("event_timestamp", bVar.mo48893b());
                arrayList.add(bundle);
            }
            a.putParcelableArrayList("event_timestamps", new ArrayList(arrayList));
            C45133as asVar = new C45133as(this.f117814f, this.f117813e);
            Parcel gA = aVar.mo17260gA();
            gA.writeString(str);
            gA.writeTypedList(d);
            C8850c.m23497f(gA, a);
            C8850c.m23499h(gA, asVar);
            aVar.mo17263hf(2, gA);
        } catch (RemoteException e) {
            C45135au.f117829a.mo48885c(e, "startInstall(%s,%s)", this.f117810a, this.f117811b);
            C146010af afVar = this.f117813e;
            afVar.f394698a.mo122509w(new RuntimeException(e));
        }
    }
}
