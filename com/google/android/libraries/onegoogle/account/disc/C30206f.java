package com.google.android.libraries.onegoogle.account.disc;

/* renamed from: com.google.android.libraries.onegoogle.account.disc.f */
/* compiled from: PG */
public final /* synthetic */ class C30206f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AccountParticleDisc f81666a;

    public /* synthetic */ C30206f(AccountParticleDisc accountParticleDisc) {
        this.f81666a = accountParticleDisc;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: android.animation.AnimatorSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: android.animation.AnimatorSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: android.animation.ObjectAnimator} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
            com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc r0 = r9.f81666a
            com.google.android.libraries.onegoogle.account.disc.DrawableBadgeViewHolder r1 = r0.f81553g
            if (r1 == 0) goto L_0x00e6
            com.google.android.libraries.onegoogle.account.disc.af r0 = r0.f81560n
            com.google.android.libraries.onegoogle.account.disc.z r0 = com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc.m56067b(r0)
            com.google.android.libraries.p1623at.p1632e.C19559g.m37304c()
            com.google.android.libraries.onegoogle.account.disc.z r2 = r1.f81587e
            boolean r2 = com.google.common.base.C58832aw.m90831a(r2, r0)
            if (r2 == 0) goto L_0x0019
            goto L_0x00e6
        L_0x0019:
            com.google.android.libraries.onegoogle.account.disc.z r2 = r1.f81587e
            android.graphics.drawable.Drawable r2 = com.google.android.libraries.onegoogle.account.disc.DrawableBadgeViewHolder.m56096a(r2)
            r1.f81587e = r0
            com.google.android.libraries.onegoogle.account.disc.z r3 = r1.f81587e
            android.graphics.drawable.Drawable r4 = com.google.android.libraries.onegoogle.account.disc.DrawableBadgeViewHolder.m56096a(r3)
            java.lang.String r5 = "badgeScale"
            java.lang.String r6 = "scaleY"
            java.lang.String r7 = "scaleX"
            r8 = 2
            if (r2 != 0) goto L_0x0066
            com.google.android.libraries.onegoogle.account.disc.BadgeFrameLayout r2 = r1.f81584b
            float[] r3 = new float[r8]
            r3 = {0, 1065353216} // fill-array
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r2, r7, r3)
            com.google.android.libraries.onegoogle.account.disc.BadgeFrameLayout r3 = r1.f81584b
            float[] r7 = new float[r8]
            r7 = {0, 1065353216} // fill-array
            android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofFloat(r3, r6, r7)
            com.google.android.libraries.onegoogle.account.disc.AvatarView r6 = r1.f81585c
            float[] r7 = new float[r8]
            r7 = {0, 1065353216} // fill-array
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r6, r5, r7)
            com.google.common.b.gu r2 = com.google.common.p4522b.C58485gu.m89848p(r2, r3, r5)
            android.animation.AnimatorSet r3 = new android.animation.AnimatorSet
            r3.<init>()
            r3.playTogether(r2)
            com.google.android.libraries.onegoogle.account.disc.ak r2 = new com.google.android.libraries.onegoogle.account.disc.ak
            r2.<init>(r1, r4)
            r3.addListener(r2)
            goto L_0x00b7
        L_0x0066:
            if (r3 != 0) goto L_0x009e
            com.google.android.libraries.onegoogle.account.disc.BadgeFrameLayout r2 = r1.f81584b
            float[] r3 = new float[r8]
            r3 = {1065353216, 0} // fill-array
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r2, r7, r3)
            com.google.android.libraries.onegoogle.account.disc.BadgeFrameLayout r3 = r1.f81584b
            float[] r4 = new float[r8]
            r4 = {1065353216, 0} // fill-array
            android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofFloat(r3, r6, r4)
            com.google.android.libraries.onegoogle.account.disc.AvatarView r4 = r1.f81585c
            float[] r6 = new float[r8]
            r6 = {1065353216, 0} // fill-array
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofFloat(r4, r5, r6)
            com.google.common.b.gu r2 = com.google.common.p4522b.C58485gu.m89848p(r2, r3, r4)
            android.animation.AnimatorSet r3 = new android.animation.AnimatorSet
            r3.<init>()
            r3.playTogether(r2)
            com.google.android.libraries.onegoogle.account.disc.al r2 = new com.google.android.libraries.onegoogle.account.disc.al
            r2.<init>(r1)
            r3.addListener(r2)
            goto L_0x00b7
        L_0x009e:
            com.google.android.libraries.onegoogle.account.disc.DrawableBadgeViewHolder$AlphaLayerDrawable r3 = new com.google.android.libraries.onegoogle.account.disc.DrawableBadgeViewHolder$AlphaLayerDrawable
            r3.<init>(r2, r4)
            int[] r2 = new int[r8]
            r2 = {0, 255} // fill-array
            java.lang.String r5 = "alpha"
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofInt(r3, r5, r2)
            com.google.android.libraries.onegoogle.account.disc.aj r5 = new com.google.android.libraries.onegoogle.account.disc.aj
            r5.<init>(r1, r3, r4)
            r2.addListener(r5)
            r3 = r2
        L_0x00b7:
            android.widget.ImageView r2 = r1.f81583a
            android.content.res.Resources r2 = r2.getResources()
            r4 = 2131493194(0x7f0c014a, float:1.8609861E38)
            int r2 = r2.getInteger(r4)
            long r4 = (long) r2
            r3.setDuration(r4)
            android.view.animation.AccelerateInterpolator r2 = new android.view.animation.AccelerateInterpolator
            r2.<init>()
            r3.setInterpolator(r2)
            com.google.android.libraries.onegoogle.account.disc.ai r2 = new com.google.android.libraries.onegoogle.account.disc.ai
            r2.<init>(r1, r0)
            r3.addListener(r2)
            android.animation.Animator r0 = r1.f81588f
            if (r0 == 0) goto L_0x00df
            r0.end()
        L_0x00df:
            r1.f81588f = r3
            android.animation.Animator r0 = r1.f81588f
            r0.start()
        L_0x00e6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.onegoogle.account.disc.C30206f.run():void");
    }
}
