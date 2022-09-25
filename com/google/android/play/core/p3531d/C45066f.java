package com.google.android.play.core.p3531d;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.C146010af;
import com.google.android.p445a.C8850c;
import com.google.android.play.core.p3531d.p3532a.C45059a;
import com.google.android.play.core.p3533e.C45069a;
import java.util.ArrayList;

/* renamed from: com.google.android.play.core.d.f */
/* compiled from: PG */
final class C45066f extends C45069a {

    /* renamed from: a */
    final /* synthetic */ C45062b f117705a;

    /* renamed from: b */
    final /* synthetic */ C146010af f117706b;

    /* renamed from: c */
    final /* synthetic */ C45068h f117707c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45066f(C45068h hVar, C146010af afVar, C45062b bVar, C146010af afVar2) {
        super(afVar);
        this.f117707c = hVar;
        this.f117705a = bVar;
        this.f117706b = afVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo48871a() {
        try {
            C45068h hVar = this.f117707c;
            C45059a aVar = (C45059a) hVar.f117711b.f117737m;
            String str = hVar.f117712c;
            C45062b bVar = this.f117705a;
            ArrayList arrayList = new ArrayList();
            for (String putString : new ArrayList(bVar.f117702a)) {
                Bundle bundle = new Bundle();
                bundle.putString("url", putString);
                arrayList.add(bundle);
            }
            Bundle bundle2 = new Bundle();
            C45067g gVar = new C45067g(this.f117707c);
            Parcel gA = aVar.mo17260gA();
            gA.writeString(str);
            gA.writeTypedList(arrayList);
            C8850c.m23497f(gA, bundle2);
            C8850c.m23499h(gA, gVar);
            aVar.mo17263hf(1, gA);
        } catch (RemoteException e) {
            C45068h.f117709a.mo48885c(e, "prewarm(%s)", this.f117707c.f117712c);
            C146010af afVar = this.f117706b;
            afVar.f394698a.mo122509w(new RuntimeException(e));
        }
    }
}
