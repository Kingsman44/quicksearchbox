package com.google.android.play.core.p3538g;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.C146010af;
import com.google.android.p445a.C8850c;
import com.google.android.play.core.p3533e.C45069a;
import com.google.android.play.core.p3538g.p3540b.C45142a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.play.core.g.al */
/* compiled from: PG */
final class C45126al extends C45069a {

    /* renamed from: a */
    final /* synthetic */ List f117818a;

    /* renamed from: b */
    final /* synthetic */ C146010af f117819b;

    /* renamed from: c */
    final /* synthetic */ C45135au f117820c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45126al(C45135au auVar, C146010af afVar, List list, C146010af afVar2) {
        super(afVar);
        this.f117820c = auVar;
        this.f117818a = list;
        this.f117819b = afVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo48871a() {
        try {
            C45135au auVar = this.f117820c;
            C45142a aVar = (C45142a) auVar.f117832c.f117737m;
            String str = auVar.f117831b;
            ArrayList d = C45135au.m80338d(this.f117818a);
            Bundle a = C45135au.m80335a();
            C45129ao aoVar = new C45129ao(this.f117820c, this.f117819b);
            Parcel gA = aVar.mo17260gA();
            gA.writeString(str);
            gA.writeTypedList(d);
            C8850c.m23497f(gA, a);
            C8850c.m23499h(gA, aoVar);
            aVar.mo17263hf(8, gA);
        } catch (RemoteException e) {
            C45135au.f117829a.mo48885c(e, "deferredInstall(%s)", this.f117818a);
            C146010af afVar = this.f117819b;
            afVar.f394698a.mo122509w(new RuntimeException(e));
        }
    }
}
