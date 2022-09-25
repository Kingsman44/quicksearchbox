package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8112e.p8113a;

import android.support.p033v7.widget.C0658ft;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.gsa.shared.util.p7187ui.C91115n;
import com.google.android.apps.gsa.sidekick.shared.cards.p7233a.C91670i;
import com.google.android.apps.gsa.sidekick.shared.monet.p7250f.C91825b;
import com.google.android.apps.gsa.sidekick.shared.monet.visualelementslogger.C91871m;
import com.google.android.apps.gsa.staticplugins.nowcards.carousel.CarouselRecyclerView;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8105a.C104450m;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.e.a.at */
/* compiled from: PG */
final class C104710at extends C0658ft {

    /* renamed from: a */
    final /* synthetic */ C104712av f291591a;

    public C104710at(C104712av avVar) {
        this.f291591a = avVar;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int i2;
        int i3;
        if (this.f291591a.f63126Q.mo28316z()) {
            if (this.f291591a.f291620g.mo56113h()) {
                ((C91825b) this.f291591a.f291620g.mo56107c()).mo86303b(recyclerView, this.f291591a.f63126Q.mo28342l(), i);
            }
            if (i == 0) {
                C104712av avVar = this.f291591a;
                avVar.f291630q = false;
                LinearLayoutManager linearLayoutManager = avVar.f291628o;
                linearLayoutManager.getClass();
                int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                if (findFirstVisibleItemPosition != -1) {
                    C104712av avVar2 = this.f291591a;
                    C104450m mVar = avVar2.f291615b;
                    LinearLayoutManager linearLayoutManager2 = avVar2.f291628o;
                    linearLayoutManager2.getClass();
                    int findFirstVisibleItemPosition2 = linearLayoutManager2.findFirstVisibleItemPosition();
                    if (findFirstVisibleItemPosition2 == -1) {
                        i2 = 0;
                    } else {
                        LinearLayoutManager linearLayoutManager3 = avVar2.f291628o;
                        linearLayoutManager3.getClass();
                        View findViewByPosition = linearLayoutManager3.findViewByPosition(findFirstVisibleItemPosition2);
                        boolean h = C91115n.m148876h(findViewByPosition);
                        int right = h ? findViewByPosition.getRight() : findViewByPosition.getLeft();
                        if (h) {
                            CarouselRecyclerView carouselRecyclerView = avVar2.f291625l;
                            carouselRecyclerView.getClass();
                            i3 = carouselRecyclerView.getRight();
                        } else {
                            CarouselRecyclerView carouselRecyclerView2 = avVar2.f291625l;
                            carouselRecyclerView2.getClass();
                            i3 = carouselRecyclerView2.getLeft();
                        }
                        i2 = right - i3;
                    }
                    mVar.mo94183d(findFirstVisibleItemPosition, i2);
                }
                if (this.f291591a.f291619f.mo56113h()) {
                    C91670i iVar = (C91670i) this.f291591a.f291619f.mo56107c();
                    if (this.f291591a.f291618e.mo49313h() || this.f291591a.f291618e.mo49314i()) {
                        iVar.mo86094c();
                    }
                    if (this.f291591a.f291618e.mo49314i()) {
                        iVar.mo86093b();
                    }
                }
                this.f291591a.mo94314E(true, false);
                if (this.f291591a.f291622i.mo56113h()) {
                    C104712av avVar3 = this.f291591a;
                    ((C91871m) avVar3.f291622i.mo56107c()).mo86399c(avVar3.f291631r);
                    this.f291591a.f291631r = null;
                }
            } else if (i == 1) {
                C104712av avVar4 = this.f291591a;
                avVar4.f291630q = true;
                if (avVar4.f291622i.mo56113h()) {
                    C104712av avVar5 = this.f291591a;
                    avVar5.f291631r = ((C91871m) avVar5.f291622i.mo56107c()).mo86397a(this.f291591a.f63126Q);
                }
                this.f291591a.mo94314E(false, false);
            }
        }
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        if (this.f291591a.f291620g.mo56113h()) {
            ((C91825b) this.f291591a.f291620g.mo56107c()).mo86305d(this.f291591a.f63126Q.mo28342l(), i, i2);
        }
    }
}
