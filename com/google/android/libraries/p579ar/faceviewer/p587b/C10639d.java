package com.google.android.libraries.p579ar.faceviewer.p587b;

import android.util.Size;
import androidx.camera.core.C1400aa;
import androidx.camera.core.C1503cg;
import androidx.camera.core.C1506cj;
import androidx.camera.core.C1551ea;
import androidx.camera.core.C1568r;
import androidx.camera.core.C1570t;
import androidx.camera.core.p069a.C1288ab;
import androidx.camera.core.p069a.C1321bh;
import androidx.camera.core.p069a.C1322bi;
import androidx.camera.core.p069a.C1328bo;
import androidx.camera.core.p069a.C1339bz;
import androidx.camera.core.p069a.C1376di;
import androidx.camera.core.p069a.C1391r;
import androidx.camera.core.p069a.C1394u;
import androidx.camera.core.p069a.C1396w;
import androidx.camera.core.p069a.p070a.C1285p;
import androidx.camera.core.p073b.C1443f;
import androidx.camera.core.p073b.C1444g;
import androidx.camera.core.p073b.C1446i;
import androidx.camera.lifecycle.C1577a;
import androidx.camera.lifecycle.C1578b;
import androidx.camera.lifecycle.C1584h;
import androidx.camera.lifecycle.LifecycleCamera;
import androidx.camera.lifecycle.LifecycleCameraRepository;
import androidx.core.p097i.C1974i;
import androidx.lifecycle.C2383n;
import androidx.lifecycle.C2391v;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.libraries.ar.faceviewer.b.d */
/* compiled from: PG */
public final /* synthetic */ class C10639d implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C10642g f35527a;

    /* renamed from: b */
    public final /* synthetic */ Size f35528b;

    /* renamed from: c */
    public final /* synthetic */ C1584h f35529c;

    public /* synthetic */ C10639d(C10642g gVar, Size size, C1584h hVar) {
        this.f35527a = gVar;
        this.f35528b = size;
        this.f35529c = hVar;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        LifecycleCamera lifecycleCamera;
        Collection<LifecycleCamera> unmodifiableCollection;
        C1394u uVar;
        LifecycleCamera lifecycleCamera2;
        Set set;
        boolean contains;
        C10642g gVar = this.f35527a;
        Size size = this.f35528b;
        C1584h hVar = this.f35529c;
        C1503cg cgVar = new C1503cg(C1339bz.m3625g());
        cgVar.f4141a.mo4216c(C1328bo.f3807A, C1339bz.f3819a, size);
        gVar.f35536e = cgVar.mo4378d();
        gVar.f35536e.mo4382h(C1506cj.f4143a, new C10638c(gVar, cVar));
        C2391v vVar = gVar.f35533b;
        C1570t tVar = gVar.f35535d;
        boolean z = false;
        C1551ea[] eaVarArr = {gVar.f35536e};
        C1285p.m3462a();
        LinkedHashSet linkedHashSet = new LinkedHashSet(tVar.f4298c);
        for (int i = 0; i <= 0; i++) {
            C1570t l = eaVarArr[i].f4267t.mo3962l();
            if (l != null) {
                Iterator it = l.f4298c.iterator();
                while (it.hasNext()) {
                    linkedHashSet.add((C1568r) it.next());
                }
            }
        }
        LinkedHashSet b = new C1570t(linkedHashSet).mo4449b(hVar.f4335f.f3929a.mo4149a());
        if (!b.isEmpty()) {
            C1444g gVar2 = new C1444g(b);
            LifecycleCameraRepository lifecycleCameraRepository = hVar.f4334e;
            synchronized (lifecycleCameraRepository.f4315a) {
                lifecycleCamera = (LifecycleCamera) lifecycleCameraRepository.f4316b.get(new C1577a(vVar, gVar2));
            }
            LifecycleCameraRepository lifecycleCameraRepository2 = hVar.f4334e;
            synchronized (lifecycleCameraRepository2.f4315a) {
                unmodifiableCollection = Collections.unmodifiableCollection(lifecycleCameraRepository2.f4316b.values());
            }
            for (int i2 = 0; i2 <= 0; i2++) {
                C1551ea eaVar = eaVarArr[i2];
                for (LifecycleCamera lifecycleCamera3 : unmodifiableCollection) {
                    synchronized (lifecycleCamera3.f4310a) {
                        contains = lifecycleCamera3.f4312c.mo4338a().contains(eaVar);
                    }
                    if (contains && lifecycleCamera3 != lifecycleCamera) {
                        throw new IllegalStateException(String.format("Use case %s already bound to a different lifecycle.", new Object[]{eaVar}));
                    }
                }
            }
            if (lifecycleCamera == null) {
                LifecycleCameraRepository lifecycleCameraRepository3 = hVar.f4334e;
                C1400aa aaVar = hVar.f4335f;
                C1288ab abVar = aaVar.f3935g;
                if (abVar != null) {
                    C1376di diVar = aaVar.f3936h;
                    if (diVar != null) {
                        C1446i iVar = new C1446i(b, abVar, diVar);
                        synchronized (lifecycleCameraRepository3.f4315a) {
                            if (lifecycleCameraRepository3.f4316b.get(new C1577a(vVar, iVar.f4004b)) == null) {
                                z = true;
                            }
                            C1974i.m5314b(z, "LifecycleCamera already exists for the given LifecycleOwner and set of cameras");
                            if (vVar.getLifecycle().mo5789a() != C2383n.DESTROYED) {
                                lifecycleCamera2 = new LifecycleCamera(vVar, iVar);
                                if (iVar.mo4338a().isEmpty()) {
                                    lifecycleCamera2.mo4456c();
                                }
                                synchronized (lifecycleCameraRepository3.f4315a) {
                                    C2391v a = lifecycleCamera2.mo4454a();
                                    C1577a aVar = new C1577a(a, lifecycleCamera2.f4312c.f4004b);
                                    LifecycleCameraRepository.LifecycleCameraRepositoryObserver a2 = lifecycleCameraRepository3.mo4462a(a);
                                    if (a2 != null) {
                                        set = (Set) lifecycleCameraRepository3.f4317c.get(a2);
                                    } else {
                                        set = new HashSet();
                                    }
                                    set.add(aVar);
                                    lifecycleCameraRepository3.f4316b.put(aVar, lifecycleCamera2);
                                    if (a2 == null) {
                                        LifecycleCameraRepository.LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver = new LifecycleCameraRepository.LifecycleCameraRepositoryObserver(a, lifecycleCameraRepository3);
                                        lifecycleCameraRepository3.f4317c.put(lifecycleCameraRepositoryObserver, set);
                                        a.getLifecycle().mo5790b(lifecycleCameraRepositoryObserver);
                                    }
                                }
                            } else {
                                throw new IllegalArgumentException("Trying to create LifecycleCamera with destroyed lifecycle.");
                            }
                        }
                        lifecycleCamera = lifecycleCamera2;
                    } else {
                        throw new IllegalStateException("CameraX not initialized yet.");
                    }
                } else {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
            }
            Iterator it2 = tVar.f4298c.iterator();
            C1391r rVar = null;
            while (it2.hasNext()) {
                C1568r rVar2 = (C1568r) it2.next();
                if (rVar2.mo4208a() != C1568r.f4295a) {
                    C1322bi a3 = rVar2.mo4208a();
                    synchronized (C1321bh.f3792a) {
                        uVar = (C1394u) C1321bh.f3793b.get(a3);
                    }
                    if (uVar == null) {
                        uVar = C1394u.f3923b;
                    }
                    lifecycleCamera.f4312c.f4003a.mo3816A();
                    C1391r a4 = uVar.mo4293a();
                    if (a4 == null) {
                        continue;
                    } else if (rVar == null) {
                        rVar = a4;
                    } else {
                        throw new IllegalArgumentException("Cannot apply multiple extended camera configs at the same time.");
                    }
                }
            }
            C1446i iVar2 = lifecycleCamera.f4312c;
            synchronized (iVar2.f4007e) {
                if (rVar == null) {
                    rVar = C1396w.f3925a;
                }
                if (!iVar2.f4005c.isEmpty()) {
                    if (!iVar2.f4006d.mo4290g().equals(rVar.mo4290g())) {
                        throw new IllegalStateException("Need to unbind all use cases before binding with extension enabled");
                    }
                }
                iVar2.f4006d = rVar;
                iVar2.f4003a.mo3831q(iVar2.f4006d);
            }
            LifecycleCameraRepository lifecycleCameraRepository4 = hVar.f4334e;
            List asList = Arrays.asList(eaVarArr);
            synchronized (lifecycleCameraRepository4.f4315a) {
                C1974i.m5313a(!asList.isEmpty());
                C2391v a5 = lifecycleCamera.mo4454a();
                for (C1578b bVar : (Set) lifecycleCameraRepository4.f4317c.get(lifecycleCameraRepository4.mo4462a(a5))) {
                    LifecycleCamera lifecycleCamera4 = (LifecycleCamera) lifecycleCameraRepository4.f4316b.get(bVar);
                    lifecycleCamera4.getClass();
                    if (!lifecycleCamera4.equals(lifecycleCamera)) {
                        if (!lifecycleCamera4.mo4455b().isEmpty()) {
                            throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner.");
                        }
                    }
                }
                try {
                    synchronized (lifecycleCamera.f4312c.f4007e) {
                    }
                    synchronized (lifecycleCamera.f4312c.f4007e) {
                    }
                    synchronized (lifecycleCamera.f4310a) {
                        lifecycleCamera.f4312c.mo4339b(asList);
                    }
                    if (a5.getLifecycle().mo5789a().mo5788a(C2383n.STARTED)) {
                        lifecycleCameraRepository4.mo4463b(a5);
                    }
                } catch (C1443f e) {
                    throw new IllegalArgumentException(e.getMessage());
                }
            }
            return "CameraXCameraProvider.startCamera";
        }
        throw new IllegalArgumentException("Provided camera selector unable to resolve a camera for the given use case");
    }
}
