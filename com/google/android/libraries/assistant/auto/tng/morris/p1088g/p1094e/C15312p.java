package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1094e;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.search.core.google.gaia.p6800c.p6801a.C86034c;
import com.google.android.gms.common.C143875g;
import com.google.android.gms.common.C143876h;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.internal.C143949t;
import com.google.android.gms.location.C144889at;
import com.google.android.gms.maps.C144995a;
import com.google.android.gms.maps.C145005b;
import com.google.android.gms.maps.C145008e;
import com.google.android.gms.maps.C145009f;
import com.google.android.gms.maps.C145012i;
import com.google.android.gms.maps.C145015l;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.C145018b;
import com.google.android.gms.maps.model.C145023g;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.p10845a.C144997b;
import com.google.android.gms.maps.p10845a.C144999d;
import com.google.android.gms.maps.p10845a.C145003h;
import com.google.android.gms.p10793f.C144157b;
import com.google.android.gms.p10793f.C144158c;
import com.google.android.gms.p10793f.C144159d;
import com.google.android.gms.p10793f.C144160e;
import com.google.android.gms.p10793f.C144163h;
import com.google.android.gms.p10793f.C144165j;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14610pp;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f.C15352z;
import com.google.android.libraries.search.location.C38570a;
import com.google.android.libraries.search.location.C38683aa;
import com.google.android.libraries.search.location.C38700f;
import com.google.android.libraries.search.location.C38725y;
import com.google.android.libraries.search.location.C38726z;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.android.p445a.C8850c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.e.p */
/* compiled from: PG */
public final class C15312p implements C145012i {

    /* renamed from: a */
    public static final C59071e f45970a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.morris.g.e.p");

    /* renamed from: b */
    public final Context f45971b;

    /* renamed from: c */
    public final C60888db f45972c;

    /* renamed from: d */
    public final List f45973d = new ArrayList();

    /* renamed from: e */
    public View f45974e;

    /* renamed from: f */
    public C14610pp f45975f;

    /* renamed from: g */
    public C145005b f45976g;

    /* renamed from: h */
    public MapView f45977h;

    /* renamed from: i */
    public C144889at f45978i;

    /* renamed from: j */
    private final C60888db f45979j;

    /* renamed from: k */
    private final C86034c f45980k;

    /* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.e.p$a */
    /* compiled from: PG */
    public interface C15313a {
        /* renamed from: fX */
        C38700f mo22185fX();

        /* renamed from: fY */
        C38683aa mo22186fY();
    }

    public C15312p(Context context, C60888db dbVar, C60888db dbVar2, C86034c cVar) {
        this.f45971b = context;
        this.f45972c = dbVar;
        this.f45979j = dbVar2;
        this.f45980k = cVar;
    }

    /* renamed from: a */
    public final void mo22179a(C145005b bVar) {
        C145003h hVar;
        C59104x b = f45970a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "Morris.LiveMapTileRndr");
        ((C59052c) ((C59052c) b).mo56372aa(46038)).mo56386p("#onMapReady");
        for (AnimatorSet end : this.f45973d) {
            end.end();
        }
        this.f45973d.clear();
        this.f45976g = bVar;
        MapStyleOptions a = MapStyleOptions.m235676a(this.f45971b);
        try {
            C144999d dVar = bVar.f391993b;
            Parcel gA = dVar.mo17260gA();
            C8850c.m23497f(gA, a);
            Parcel gT = dVar.mo17261gT(91, gA);
            C8850c.m23500i(gT);
            gT.recycle();
            try {
                C144999d dVar2 = bVar.f391993b;
                Parcel gA2 = dVar2.mo17260gA();
                C8850c.m23495d(gA2, false);
                dVar2.mo17262he(51, gA2);
                try {
                    C144999d dVar3 = bVar.f391993b;
                    Parcel gA3 = dVar3.mo17260gA();
                    C8850c.m23495d(gA3, true);
                    dVar3.mo17262he(18, gA3);
                    try {
                        C144999d dVar4 = bVar.f391993b;
                        Parcel gA4 = dVar4.mo17260gA();
                        C8850c.m23495d(gA4, true);
                        dVar4.mo17262he(22, gA4);
                        try {
                            IInterface iInterface = null;
                            if (bVar.f391992a == null) {
                                C144999d dVar5 = bVar.f391993b;
                                Parcel gT2 = dVar5.mo17261gT(25, dVar5.mo17260gA());
                                IBinder readStrongBinder = gT2.readStrongBinder();
                                if (readStrongBinder == null) {
                                    hVar = null;
                                } else {
                                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                                    if (queryLocalInterface instanceof C145003h) {
                                        hVar = (C145003h) queryLocalInterface;
                                    } else {
                                        hVar = new C145003h(readStrongBinder);
                                    }
                                }
                                gT2.recycle();
                                bVar.f391992a = new C145015l(hVar);
                            }
                            try {
                                C145003h hVar2 = bVar.f391992a.f392007a;
                                Parcel gA5 = hVar2.mo17260gA();
                                C8850c.m23495d(gA5, false);
                                hVar2.mo17262he(3, gA5);
                                try {
                                    C144997b a2 = C144995a.m235659a();
                                    Parcel gA6 = a2.mo17260gA();
                                    gA6.writeFloat(18.0f);
                                    Parcel gT3 = a2.mo17261gT(4, gA6);
                                    IBinder readStrongBinder2 = gT3.readStrongBinder();
                                    if (readStrongBinder2 != null) {
                                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                        iInterface = queryLocalInterface2 instanceof C144165j ? (C144165j) queryLocalInterface2 : new C144163h(readStrongBinder2);
                                    }
                                    gT3.recycle();
                                    C143919bh.m233958a(iInterface);
                                    try {
                                        C144999d dVar6 = bVar.f391993b;
                                        Parcel gA7 = dVar6.mo17260gA();
                                        C8850c.m23499h(gA7, iInterface);
                                        dVar6.mo17262he(4, gA7);
                                        View view = this.f45974e;
                                        view.getClass();
                                        view.setVisibility(0);
                                        View view2 = this.f45974e;
                                        view2.getClass();
                                        view2.setOnClickListener(new C15301e(this));
                                        C60922j.m93045h(mo22181c(), C47810es.m84966f(new C15302f(this)), this.f45972c);
                                        this.f45978i = new C15311o(this, bVar);
                                        C60922j.m93045h(mo22180b(), C47810es.m84966f(new C15303g(this)), this.f45972c);
                                    } catch (RemoteException e) {
                                        throw new C145023g(e);
                                    }
                                } catch (RemoteException e2) {
                                    throw new C145023g(e2);
                                }
                            } catch (RemoteException e3) {
                                throw new C145023g(e3);
                            }
                        } catch (RemoteException e4) {
                            throw new C145023g(e4);
                        }
                    } catch (RemoteException e5) {
                        throw new C145023g(e5);
                    }
                } catch (RemoteException e6) {
                    throw new C145023g(e6);
                }
            } catch (RemoteException e7) {
                throw new C145023g(e7);
            }
        } catch (RemoteException e8) {
            throw new C145023g(e8);
        }
    }

    /* renamed from: b */
    public final C60870cx mo22180b() {
        C60870cx b = this.f45980k.mo79697b();
        C15306j jVar = new C15306j(this);
        return C60922j.m93044g(b, C47810es.m84963c(jVar), this.f45972c);
    }

    /* renamed from: c */
    public final C60870cx mo22181c() {
        C60870cx b = this.f45980k.mo79697b();
        C15305i iVar = new C15305i(this);
        return C60922j.m93044g(b, C47810es.m84963c(iVar), this.f45972c);
    }

    /* renamed from: d */
    public final void mo22182d(C38683aa aaVar) {
        C58976aa aaVar2 = C58975e.f156826a;
        C38725y d = C38726z.m68011d(C39226b.TAG_CLASSIC_ASSISTANT_MORRIS_LO);
        ((C38570a) d).f101954b = 3;
        C60870cx b = aaVar.mo41548b(d.mo41492a());
        C15308l lVar = new C15308l(this);
        C60922j.m93045h(b, C47810es.m84966f(lVar), this.f45979j);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: e */
    public final void mo22183e(ViewGroup viewGroup, ContextThemeWrapper contextThemeWrapper) {
        LayoutInflater.from(contextThemeWrapper).inflate(R.layout.live_map_tile, viewGroup, true);
        this.f45977h = (MapView) viewGroup.findViewById(R.id.map);
        this.f45974e = viewGroup.findViewById(R.id.my_location_button);
        List list = this.f45973d;
        MapView mapView = this.f45977h;
        mapView.getClass();
        list.add(C15352z.m31953e(mapView, 0));
        MapView mapView2 = this.f45977h;
        mapView2.getClass();
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            C145009f fVar = mapView2.f391987a;
            fVar.mo119699c(new C144157b(fVar));
            if (mapView2.f391987a.f390475b == null) {
                C143875g gVar = C143875g.f389987a;
                Context context = mapView2.getContext();
                int j = gVar.mo119362j(context, C143876h.f389990c);
                String d = C143949t.m234114d(context, j);
                String c = C143949t.m234113c(context, j);
                LinearLayout linearLayout = new LinearLayout(mapView2.getContext());
                linearLayout.setOrientation(1);
                linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                mapView2.addView(linearLayout);
                TextView textView = new TextView(mapView2.getContext());
                textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                textView.setText(d);
                linearLayout.addView(textView);
                Intent k = gVar.mo119363k(context, j, (String) null);
                if (k != null) {
                    Button button = new Button(context);
                    button.setId(16908313);
                    button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                    button.setText(c);
                    linearLayout.addView(button);
                    button.setOnClickListener(new C144158c(context, k));
                }
            }
            StrictMode.setThreadPolicy(threadPolicy);
            MapView mapView3 = this.f45977h;
            mapView3.getClass();
            C143919bh.m233964g("getMapAsync() must be called on the main thread");
            C145009f fVar2 = mapView3.f391987a;
            C145008e eVar = fVar2.f390475b;
            if (eVar != null) {
                eVar.mo120499a(this);
            } else {
                fVar2.f391998c.add(this);
            }
            MapView mapView4 = this.f45977h;
            mapView4.getClass();
            C145009f fVar3 = mapView4.f391987a;
            fVar3.mo119699c(new C144159d(fVar3));
            MapView mapView5 = this.f45977h;
            mapView5.getClass();
            C145009f fVar4 = mapView5.f391987a;
            fVar4.mo119699c(new C144160e(fVar4));
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicy);
            throw th;
        }
    }

    /* renamed from: f */
    public final void mo22184f(Location location, float f) {
        C144165j jVar;
        C58976aa aaVar = C58975e.f156826a;
        CameraPosition a = C145018b.m235677a(new LatLng(location.getLatitude(), location.getLongitude()), f, 0.0f, 0.0f);
        try {
            C144997b a2 = C144995a.m235659a();
            Parcel gA = a2.mo17260gA();
            C8850c.m23497f(gA, a);
            Parcel gT = a2.mo17261gT(7, gA);
            IBinder readStrongBinder = gT.readStrongBinder();
            if (readStrongBinder == null) {
                jVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                if (queryLocalInterface instanceof C144165j) {
                    jVar = (C144165j) queryLocalInterface;
                } else {
                    jVar = new C144163h(readStrongBinder);
                }
            }
            gT.recycle();
            C143919bh.m233958a(jVar);
            C145005b bVar = this.f45976g;
            bVar.getClass();
            try {
                C144999d dVar = bVar.f391993b;
                Parcel gA2 = dVar.mo17260gA();
                C8850c.m23499h(gA2, jVar);
                dVar.mo17262he(5, gA2);
            } catch (RemoteException e) {
                throw new C145023g(e);
            }
        } catch (RemoteException e2) {
            throw new C145023g(e2);
        }
    }
}
