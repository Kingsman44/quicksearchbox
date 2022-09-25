package com.google.apps.tiktok.coroutines.p3632a;

import com.google.apps.tiktok.coroutines.C46590a;
import com.google.apps.tiktok.coroutines.C46649b;
import com.google.apps.tiktok.coroutines.C46650c;
import p5462h.C69677g;
import p5462h.p5473f.p5474a.C69631q;
import p5462h.p5473f.p5475b.C69663m;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.coroutines.a.u */
/* compiled from: PG */
final /* synthetic */ class C46643u extends C69663m implements C69631q {

    /* renamed from: a */
    public static final C46643u f121892a = new C46643u();

    public C46643u() {
        super(3, C46645w.class, "reduceRemote", "reduceRemote(Lcom/google/apps/tiktok/coroutines/flow/RemoteSnapshot;Lcom/google/apps/tiktok/coroutines/flow/CacheReadState;Z)Lcom/google/apps/tiktok/coroutines/flow/RemoteSnapshot;", 1);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        Object bdVar;
        Object ayVar;
        C46623be beVar = (C46623be) obj;
        C46631i iVar = (C46631i) obj2;
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        C69664n.m101061g(beVar, "p0");
        C69664n.m101061g(iVar, "p1");
        if (iVar instanceof C46629g) {
            if (beVar instanceof C46615ax) {
                return new C46619ba((Throwable) null);
            }
            if (beVar instanceof C46614aw) {
                ayVar = new C46619ba(((C46614aw) beVar).f121811a);
            } else if (beVar instanceof C46619ba) {
                ayVar = new C46619ba(((C46619ba) beVar).f121816a);
            } else if (beVar instanceof C46617az) {
                ayVar = new C46621bc(((C46617az) beVar).f121814a, (Throwable) null);
            } else if (beVar instanceof C46622bd) {
                C46622bd bdVar2 = (C46622bd) beVar;
                ayVar = new C46621bc(bdVar2.f121821a, bdVar2.f121822b);
            } else if (beVar instanceof C46621bc) {
                C46621bc bcVar = (C46621bc) beVar;
                ayVar = new C46621bc(bcVar.f121819a, bcVar.f121820b);
            } else if (beVar instanceof C46616ay) {
                ayVar = new C46616ay(((C46616ay) beVar).f121813a);
            } else if (beVar instanceof C46620bb) {
                C46620bb bbVar = (C46620bb) beVar;
                ayVar = new C46620bb(bbVar.f121817a, bbVar.f121818b);
            } else {
                throw new C69677g();
            }
        } else if (iVar instanceof C46630h) {
            if (beVar instanceof C46615ax) {
                return new C46616ay((Throwable) null);
            }
            if (beVar instanceof C46614aw) {
                ayVar = new C46616ay(((C46614aw) beVar).f121811a);
            } else if (beVar instanceof C46619ba) {
                ayVar = new C46616ay(((C46619ba) beVar).f121816a);
            } else if (beVar instanceof C46616ay) {
                ayVar = new C46616ay(((C46616ay) beVar).f121813a);
            } else if (beVar instanceof C46617az) {
                ayVar = new C46620bb(((C46617az) beVar).f121814a, (Throwable) null);
            } else if (beVar instanceof C46622bd) {
                C46622bd bdVar3 = (C46622bd) beVar;
                ayVar = new C46620bb(bdVar3.f121821a, bdVar3.f121822b);
            } else if (beVar instanceof C46621bc) {
                C46621bc bcVar2 = (C46621bc) beVar;
                ayVar = new C46620bb(bcVar2.f121819a, bcVar2.f121820b);
            } else if (beVar instanceof C46620bb) {
                C46620bb bbVar2 = (C46620bb) beVar;
                ayVar = new C46620bb(bbVar2.f121817a, bbVar2.f121818b);
            } else {
                throw new C69677g();
            }
        } else if (iVar instanceof C46628f) {
            C46650c cVar = ((C46628f) iVar).f121832a;
            if (cVar instanceof C46649b) {
                C46625c cVar2 = (C46625c) cVar.mo50592a();
                if (cVar2 instanceof C46618b) {
                    Object obj4 = ((C46618b) cVar2).f121815a;
                    if (beVar instanceof C46615ax) {
                        throw new C46608aq("Advanced from idle to complete with no intermediate state.");
                    } else if (beVar instanceof C46617az) {
                        throw new C46608aq("Advanced from Read to another response with no intermediate state.");
                    } else if (beVar instanceof C46622bd) {
                        throw new C46608aq("Advanced from StaleRead to another response with no intermediate state.");
                    } else if (beVar instanceof C46614aw) {
                        throw new C46608aq("Advanced from Failed to another response with no intermediate state.");
                    } else if (beVar instanceof C46619ba) {
                        if (!booleanValue) {
                            return new C46617az(obj4);
                        }
                        bdVar = new C46621bc(obj4, ((C46619ba) beVar).f121816a);
                    } else if (beVar instanceof C46616ay) {
                        if (!booleanValue) {
                            return new C46617az(obj4);
                        }
                        bdVar = new C46620bb(obj4, ((C46616ay) beVar).f121813a);
                    } else if (beVar instanceof C46621bc) {
                        if (!booleanValue) {
                            return new C46617az(obj4);
                        }
                        bdVar = new C46621bc(obj4, ((C46621bc) beVar).f121820b);
                    } else if (!(beVar instanceof C46620bb)) {
                        throw new C69677g();
                    } else if (!booleanValue) {
                        return new C46617az(obj4);
                    } else {
                        bdVar = new C46620bb(obj4, ((C46620bb) beVar).f121818b);
                    }
                } else if (cVar2 instanceof C46591a) {
                    C46591a aVar = (C46591a) cVar2;
                    throw null;
                } else {
                    throw new C69677g();
                }
            } else if (cVar instanceof C46590a) {
                Throwable th = ((C46590a) cVar).f121777a;
                if (beVar instanceof C46615ax) {
                    throw new C46608aq("Advanced from idle to failure with no intermediate state.");
                } else if (beVar instanceof C46617az) {
                    throw new C46608aq("Advanced from Read to a failure with no intermediate state.");
                } else if (beVar instanceof C46622bd) {
                    throw new C46608aq("Advanced from StaleRead to a failure with no intermediate state.");
                } else if (beVar instanceof C46614aw) {
                    throw new C46608aq("Advanced from Failed to another failure with no intermediate state.");
                } else if (beVar instanceof C46619ba) {
                    if (!booleanValue) {
                        return new C46614aw(th);
                    }
                    Throwable th2 = ((C46619ba) beVar).f121816a;
                    if (th2 == null) {
                        return new C46619ba(th);
                    }
                    ayVar = new C46619ba(th2);
                } else if (beVar instanceof C46616ay) {
                    if (!booleanValue) {
                        return new C46614aw(th);
                    }
                    Throwable th3 = ((C46616ay) beVar).f121813a;
                    if (th3 == null) {
                        return new C46616ay(th);
                    }
                    ayVar = new C46616ay(th3);
                } else if (beVar instanceof C46621bc) {
                    if (booleanValue) {
                        C46621bc bcVar3 = (C46621bc) beVar;
                        if (bcVar3.f121820b == null) {
                            return new C46621bc(bcVar3.f121819a, th);
                        }
                        return beVar;
                    }
                    bdVar = new C46622bd(((C46621bc) beVar).f121819a, th);
                } else if (!(beVar instanceof C46620bb)) {
                    throw new C69677g();
                } else if (booleanValue) {
                    C46620bb bbVar3 = (C46620bb) beVar;
                    if (bbVar3.f121818b == null) {
                        return new C46620bb(bbVar3.f121817a, th);
                    }
                    return beVar;
                } else {
                    bdVar = new C46622bd(((C46620bb) beVar).f121817a, th);
                }
            } else {
                throw new C69677g();
            }
            return bdVar;
        } else {
            throw new C69677g();
        }
        return ayVar;
    }
}
