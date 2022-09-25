package com.android.launcher3;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.android.launcher3.SearchDropTargetBar;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
final class LauncherClings implements View.OnClickListener {
    public final LayoutInflater mInflater;
    boolean mIsVisible;
    final Launcher mLauncher;

    public LauncherClings(Launcher launcher) {
        this.mLauncher = launcher;
        this.mInflater = LayoutInflater.from(launcher);
    }

    private final void dismissMigrationCling() {
        Launcher launcher = this.mLauncher;
        Workspace workspace = launcher.mWorkspace;
        if (workspace != null) {
            workspace.setAlpha(1.0f);
        }
        Hotseat hotseat = launcher.mHotseat;
        if (hotseat != null) {
            hotseat.setAlpha(1.0f);
        }
        View view = launcher.mPageIndicators;
        if (view != null) {
            view.setAlpha(1.0f);
        }
        SearchDropTargetBar searchDropTargetBar = launcher.mSearchDropTargetBar;
        if (searchDropTargetBar != null) {
            searchDropTargetBar.animateToState(SearchDropTargetBar.State.SEARCH_BAR, 0, (AnimatorSet) null);
        }
        this.mLauncher.mWorkspace.post(new Runnable() {
            public final void run() {
                C53191 r0 = new Runnable() {
                    public final void run() {
                        LauncherClings.this.showLongPressCling(false);
                    }
                };
                LauncherClings launcherClings = LauncherClings.this;
                launcherClings.dismissCling$ar$ds(launcherClings.mLauncher.mLauncherView.findViewById(R.id.migration_cling), r0, "cling_gel.migration.dismissed");
            }
        });
    }

    public static void markFirstRunClingDismissed(Context context) {
        Utilities.getPrefs(context).edit().putBoolean("cling_gel.workspace.dismissed", true).apply();
    }

    /* access modifiers changed from: package-private */
    public final void dismissCling$ar$ds(final View view, final Runnable runnable, final String str) {
        if (view != null && view.getVisibility() != 8) {
            view.animate().alpha(0.0f).setDuration(200).withEndAction(new Runnable() {
                public final void run() {
                    view.setVisibility(8);
                    LauncherClings.this.mLauncher.mSharedPrefs.edit().putBoolean(str, true).apply();
                    LauncherClings.this.mIsVisible = false;
                    Runnable runnable = runnable;
                    if (runnable != null) {
                        runnable.run();
                    }
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    public final void dismissLongPressCling() {
        this.mLauncher.mWorkspace.post(new Runnable() {
            public final void run() {
                LauncherClings launcherClings = LauncherClings.this;
                launcherClings.dismissCling$ar$ds(launcherClings.mLauncher.mLauncherView.findViewById(R.id.longpress_cling), (Runnable) null, "cling_gel.workspace.dismissed");
            }
        });
    }

    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.cling_dismiss_migration_use_default) {
            dismissMigrationCling();
        } else if (id == R.id.cling_dismiss_migration_copy_apps) {
            LauncherModel launcherModel = this.mLauncher.mModel;
            launcherModel.resetLoadedState$ar$ds(false);
            launcherModel.startLoader(-1001, 3);
            SharedPreferences.Editor edit = Utilities.getPrefs(this.mLauncher).edit();
            edit.putBoolean("launcher.user_migrated_from_old_data", true);
            edit.apply();
            dismissMigrationCling();
        } else if (id == R.id.cling_dismiss_longpress_info) {
            dismissLongPressCling();
        }
    }

    public final void showLongPressCling(boolean z) {
        this.mIsVisible = true;
        ViewGroup viewGroup = (ViewGroup) this.mLauncher.mLauncherView.findViewById(R.id.launcher);
        View inflate = this.mInflater.inflate(R.layout.longpress_cling, viewGroup, false);
        inflate.setOnLongClickListener(new View.OnLongClickListener() {
            public final boolean onLongClick(View view) {
                LauncherClings.this.mLauncher.showOverviewMode$ar$ds$49c8ce8_0(false);
                LauncherClings.this.dismissLongPressCling();
                return true;
            }
        });
        final ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.cling_content);
        this.mInflater.inflate(z ? R.layout.longpress_cling_welcome_content : R.layout.longpress_cling_content, viewGroup2);
        viewGroup2.findViewById(R.id.cling_dismiss_longpress_info).setOnClickListener(this);
        if ("crop_bg_top_and_sides".equals(viewGroup2.getTag())) {
            viewGroup2.setBackground(new BorderCropDrawable(this.mLauncher.getResources().getDrawable(R.drawable.cling_bg)));
        }
        viewGroup.addView(inflate);
        if (!z) {
            viewGroup2.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                public final void onGlobalLayout() {
                    ObjectAnimator objectAnimator;
                    viewGroup2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    if ("crop_bg_top_and_sides".equals(viewGroup2.getTag())) {
                        ViewGroup viewGroup = viewGroup2;
                        viewGroup.setTranslationY((float) (-viewGroup.getMeasuredHeight()));
                        objectAnimator = LauncherAnimUtils.ofFloat(viewGroup2, "translationY", 0.0f);
                    } else {
                        viewGroup2.setScaleX(0.0f);
                        viewGroup2.setScaleY(0.0f);
                        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat("scaleX", new float[]{1.0f});
                        PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat("scaleY", new float[]{1.0f});
                        objectAnimator = LauncherAnimUtils.ofPropertyValuesHolder(viewGroup2, ofFloat, ofFloat2);
                    }
                    objectAnimator.setDuration(250);
                    objectAnimator.setInterpolator(new LogDecelerateInterpolator());
                    objectAnimator.start();
                }
            });
        }
    }
}
